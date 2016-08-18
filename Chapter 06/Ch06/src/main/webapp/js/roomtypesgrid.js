
Ext.onReady(function()
         {
            Ext.define('HmsRoomType', {
               extend: 'Ext.data.Model',
               fields: [
                          {name: 'id', type:'int'},
                          {name: 'type', type: 'string'}
                       ]
            });
            var roomStore = Ext.create('Ext.data.Store', {
               model: 'HmsRoomType',
               autoLoad: true,
               autoSync: true,
               pageSize: 20,
               remoteSort: true,
               proxy: {
                         type: 'ajax',
                         url		: '/ch06/hms/ext/getRoomTypes',
                        
                         reader: {
                                    type: 'json',
                                    root: 'roomTypes',
                                    successProperty: 'success'
                                 },
                         writer: {
                                    type: 'json', 
                                    writeAllFields: true,
                                    allowSingle: false,
                                    encode: false,
                                    root: 'roomTypes'
                                 },
                         listeners: {
                                       exception: function(proxy, response, operation){
                                          Ext.MessageBox.show({
                                             title: 'ERROR',
                                             msg: operation.getError(),
                                             icon: Ext.MessageBox.ERROR,
                                             buttons: Ext.Msg.OK
                                          });
                                       }
                                    }
                      },
              autoLoad: true
            });
            var rowEditor = Ext.create('Ext.grid.plugin.RowEditing', {clicksToEdit: 2});
            var grid = Ext.create('Ext.grid.Panel', {
               renderTo: Ext.getBody(),
               frame: true,
               store: roomStore,
               width: 550,
               height: 350,
               title: 'Room Types',
               selType: 'rowmodel',
               columns: [{
                            text: 'ID',
                            flex: 2,
                            dataIndex: 'id',
                            editor: {
                                       xtype: 'textfield',
                                       allowBlank: false
                                    }
                         },
                         {
                            text: 'Room Type',
                            flex: 5,
                            dataIndex: 'type',
                            editor: {
                                       xtype: 'textfield',
                                       allowBlank: false
                                    }
                         }
                        ],
               plugins: rowEditor,
               dockedItems: [
                               {
                                  xtype: 'toolbar',
                                  items: [
                                            {
                                               text: 'Add',
                                               handler: function() {
                                                  rowEditor.cancelEdit();
                                                  // Create a record instance through the ModelManager
                                                  var r = Ext.ModelManager.create({
                                                     id: 0,
                                                     type: 'none'
                                 
                                                  }, 'HmsRoomType');
                                                  roomStore.insert(0, r);
                                                  rowEditor.startEdit(0, 0);
                                               }
                                             },
                                             {
                                                text: 'Delete',
                                                handler: function() {
                                                   var sm = grid.getSelectionModel();
                                                   rowEditor.cancelEdit();
                                                   roomStore.remove(sm.getSelection());
                                                   if (roomStore.getCount() > 0) {sm.select(0);}
                                                }
                                             }
                                          ]
                               }
                            ],
               bbar: Ext.create('Ext.PagingToolbar', {
                  store: roomStore,
                  displayInfo: true,
                  displayMsg: 'Displaying records {0} - {1} of {2}',
                  emptyMsg: "No records to display"
               })
            });
         });