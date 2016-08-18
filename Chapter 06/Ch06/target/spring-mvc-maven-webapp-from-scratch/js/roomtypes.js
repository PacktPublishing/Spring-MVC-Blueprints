Ext.onReady(function () {
  Ext.define('hms.model.HmsRoomType', {
    extend: 'Ext.data.Model',
    fields: [
      {name: 'id', type: 'int'},
      {name: 'type', type: 'string'}
    ]
  });
 
  Ext.define('hms.store.HmsRoomTypes', {
    extend  : 'Ext.data.Store',
    storeId	: 'roomTypesStore',
    model   : 'hms.model.HmsRoomType',
    fields  : ['id', 'type'],
    proxy	: {
        type	: 'ajax',
        url		: '/ch06/hms/ext/getRoomTypes',
        reader	: {
            type	: 'json',
            root	: 'roomTypes'
        }
    },
    autoLoad: true
  });
 
  Ext.define('hms.view.RoomTypeList', {
    extend	: 'Ext.grid.Panel',
    alias	: 'widget.roomTypeList',
    title	: 'HMS Room Type List',
    store	: 'HmsRoomTypes',
    initComponent: function () {
      this.tbar = [{
        text    : 'Add Room Type',
        action  : 'add_room_type',
        iconCls : 'room-add'
      }];
      this.columns = [
        { header: 'ID', dataIndex: 'id', width: 50 },
        { header: 'Room Type', dataIndex: 'type', width: 100  },
        { header: 'Delete', width: 60,
          renderer: function (v, m, r) {
            var id = Ext.id();
            Ext.defer(function () {
              Ext.widget('image', {
                renderTo: id,
                name: 'delete',
                src : '../images/book_delete.png',
                listeners : {
                  afterrender: function (me) { 
                    me.getEl().on('click', function() {
                      var grid = Ext.ComponentQuery.query('roomTypeList')[0];
                      if (grid) {
                        var sm = grid.getSelectionModel();
                        var rs = sm.getSelection();
                        if (!rs.length) {
                          Ext.Msg.alert('Info', 'No Room Type Selected');
                          return;
                        }
                        Ext.Msg.confirm('Remove Room Type', 
                          'Are you sure you want to delete?', 
                          function (button) {
                            if (button == 'yes') {
                               	var book = rs[0].getData();
                            	Ext.Ajax.request({
                            	    url		: '/ch06/hms/ext/deleteRoomType',
                            	    method  : 'POST',
                            	    jsonData: book,	
                            	    success: function(response){
                            	    	var grid = Ext.ComponentQuery.query('roomTypeList')[0];
                            	        grid.getStore().load();
                            	    },
                            	    failure: function() {
                            	    	Ext.Msg.alert('Info', 'Other tables uses this room type!');
                                        return;
                            	    }
                            	});
                            }
                        });
                      }
                    });
                  }
                }
              });
            }, 50);
            return Ext.String.format('<div id="{0}"></div>', id);
          }
        }
      ];
      this.callParent(arguments);
    }
  });
 
    Ext.define('hms.view.RoomTypeForm', {
      extend  : 'Ext.window.Window',
      alias   : 'widget.roomTypeForm',
      title   : 'Add Book Type',
      width   : 800,
      layout  : 'fit',
      resizable: false,
      closeAction: 'hide',
      modal   : true,
      config  : {
        recordIndex : 0,
        action : ''
      },
      items   : [{
        xtype : 'form',
        layout: 'anchor',
        bodyStyle: {
          background: 'none',
          padding: '5px',
          border: '0'
        },
        defaults: {
          xtype : 'textfield',
          anchor: '100%'
        },
        items : [{
          name  : 'id',
          type : 'int',
          fieldLabel: 'ID'
        },{
          name: 'type',
          type : 'string',
          fieldLabel: 'Room Type'
        }]
      }],
      buttons: [{
        text: 'OK',
        action: 'add_room_type'
      },{
        text    : 'Reset',
        handler : function () { 
          this.up('window').down('form').getForm().reset(); 
        }
      },{
        text   : 'Cancel',
        handler: function () { 
          this.up('window').close();
        }
      }]
    });
 
  Ext.define('hms.controller.HmsRoomTypes', {
    extend  : 'Ext.app.Controller',
    stores  : ['HmsRoomTypes'],
    views   : ['RoomTypeList', 'RoomTypeForm'],
    refs    : [{
      ref   : 'formWindow',
      xtype : 'roomTypeForm',
      selector: 'roomTypeForm',
      autoCreate: true
    }],
    init: function () {
      this.control({
        'roomTypeList > toolbar > button[action=add_room_type]': {
          click: this.showAddForm
        },
        'roomTypeList': {
          itemdblclick: this.onRowdblclick
        },
        'roomTypeForm button[action=add_room_type]': {
          click: this.doAddBook
        }
      });
    },
    onRowdblclick: function(me, record, item, index) {
      var win = this.getFormWindow();
      win.setTitle('Edit Room Type');
      win.setAction('edit_room_type');
      win.setRecordIndex(index);
      win.down('form').getForm().setValues(record.getData());
      win.show();
    },
    showAddForm: function () {
      var win = this.getFormWindow();
      win.setTitle('Add Room Type');
      win.setAction('add_room_type');
      win.down('form').getForm().reset();
      win.show();
    },
    doAddBook: function () {
      
      var win = this.getFormWindow();
      alert('hello');
     var store = this.getHmsRoomTypesStore();
     
      var values = win.down('form').getValues();
     
      var action = win.getAction();
      var url = '';
      if(action == 'edit_room_type') {
    	  url = '/ch06/hms/ext/updateRoomType';
      }
      else {
    	  url = '/ch06/hms/ext/addRoomType';
      }
      Ext.Ajax.request({
  		url		: url,
    	method  : 'POST',
    	jsonData: values,	
    	success: function(response){
    	    	store.load();
    		}
    	});
      win.close();
    }
  });
 
  Ext.application({
    name  : 'hms',
    controllers: ['HmsRoomTypes'],
      launch: function () {
        Ext.widget('roomTypeList', {
          width : 250,
          height: 500,
          renderTo: 'output'
        });
      }
    }
  );
});