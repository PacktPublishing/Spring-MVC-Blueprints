/**
 * Created by Ong Chinh on 5/30/15.
 */
(function ($) {
    "use strict";
    $.mdMapExtend = {};
    $.fn.mdMapExtend = function (opts) {
        $.styles = {
            none : null,
            grayscale: [{featureType: 'all',  stylers: [{saturation: -100},{gamma: 0.50}]}],
            appleMapsEsque: [{"featureType":"landscape.man_made","elementType":"geometry","stylers":[{"color":"#f7f1df"}]},{"featureType":"landscape.natural","elementType":"geometry","stylers":[{"color":"#d0e3b4"}]},{"featureType":"landscape.natural.terrain","elementType":"geometry","stylers":[{"visibility":"off"}]},{"featureType":"poi","elementType":"labels","stylers":[{"visibility":"off"}]},{"featureType":"poi.business","elementType":"all","stylers":[{"visibility":"off"}]},{"featureType":"poi.medical","elementType":"geometry","stylers":[{"color":"#fbd3da"}]},{"featureType":"poi.park","elementType":"geometry","stylers":[{"color":"#bde6ab"}]},{"featureType":"road","elementType":"geometry.stroke","stylers":[{"visibility":"off"}]},{"featureType":"road","elementType":"labels","stylers":[{"visibility":"off"}]},{"featureType":"road.highway","elementType":"geometry.fill","stylers":[{"color":"#ffe15f"}]},{"featureType":"road.highway","elementType":"geometry.stroke","stylers":[{"color":"#efd151"}]},{"featureType":"road.arterial","elementType":"geometry.fill","stylers":[{"color":"#ffffff"}]},{"featureType":"road.local","elementType":"geometry.fill","stylers":[{"color":"black"}]},{"featureType":"transit.station.airport","elementType":"geometry.fill","stylers":[{"color":"#cfb2db"}]},{"featureType":"water","elementType":"geometry","stylers":[{"color":"#a2daf2"}]}],
            blueWater: [{"featureType":"administrative","elementType":"labels.text.fill","stylers":[{"color":"#444444"}]},{"featureType":"landscape","elementType":"all","stylers":[{"color":"#f2f2f2"}]},{"featureType":"poi","elementType":"all","stylers":[{"visibility":"off"}]},{"featureType":"road","elementType":"all","stylers":[{"saturation":-100},{"lightness":45}]},{"featureType":"road.highway","elementType":"all","stylers":[{"visibility":"simplified"}]},{"featureType":"road.arterial","elementType":"labels.icon","stylers":[{"visibility":"off"}]},{"featureType":"transit","elementType":"all","stylers":[{"visibility":"off"}]},{"featureType":"water","elementType":"all","stylers":[{"color":"#46bcec"},{"visibility":"on"}]}],
            shadesOfGrey: [{"featureType":"all","elementType":"labels.text.fill","stylers":[{"saturation":36},{"color":"#000000"},{"lightness":40}]},{"featureType":"all","elementType":"labels.text.stroke","stylers":[{"visibility":"on"},{"color":"#000000"},{"lightness":16}]},{"featureType":"all","elementType":"labels.icon","stylers":[{"visibility":"off"}]},{"featureType":"administrative","elementType":"geometry.fill","stylers":[{"color":"#000000"},{"lightness":20}]},{"featureType":"administrative","elementType":"geometry.stroke","stylers":[{"color":"#000000"},{"lightness":17},{"weight":1.2}]},{"featureType":"landscape","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":20}]},{"featureType":"poi","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":21}]},{"featureType":"road.highway","elementType":"geometry.fill","stylers":[{"color":"#000000"},{"lightness":17}]},{"featureType":"road.highway","elementType":"geometry.stroke","stylers":[{"color":"#000000"},{"lightness":29},{"weight":0.2}]},{"featureType":"road.arterial","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":18}]},{"featureType":"road.local","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":16}]},{"featureType":"transit","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":19}]},{"featureType":"water","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":17}]}],
            paleDawn: [{"featureType":"administrative","elementType":"all","stylers":[{"visibility":"on"},{"lightness":33}]},{"featureType":"landscape","elementType":"all","stylers":[{"color":"#f2e5d4"}]},{"featureType":"poi.park","elementType":"geometry","stylers":[{"color":"#c5dac6"}]},{"featureType":"poi.park","elementType":"labels","stylers":[{"visibility":"on"},{"lightness":20}]},{"featureType":"road","elementType":"all","stylers":[{"lightness":20}]},{"featureType":"road.highway","elementType":"geometry","stylers":[{"color":"#c5c6c6"}]},{"featureType":"road.arterial","elementType":"geometry","stylers":[{"color":"#e4d7c6"}]},{"featureType":"road.local","elementType":"geometry","stylers":[{"color":"#fbfaf7"}]},{"featureType":"water","elementType":"all","stylers":[{"visibility":"on"},{"color":"#acbcc9"}]}],
            blueEssence: [{"featureType":"landscape.natural","elementType":"geometry.fill","stylers":[{"visibility":"on"},{"color":"#e0efef"}]},{"featureType":"poi","elementType":"geometry.fill","stylers":[{"visibility":"on"},{"hue":"#1900ff"},{"color":"#c0e8e8"}]},{"featureType":"road","elementType":"geometry","stylers":[{"lightness":100},{"visibility":"simplified"}]},{"featureType":"road","elementType":"labels","stylers":[{"visibility":"off"}]},{"featureType":"transit.line","elementType":"geometry","stylers":[{"visibility":"on"},{"lightness":700}]},{"featureType":"water","elementType":"all","stylers":[{"color":"#7dcdcd"}]}],
            lightMonochrome : [{"featureType":"administrative.locality","elementType":"all","stylers":[{"hue":"#2c2e33"},{"saturation":7},{"lightness":19},{"visibility":"on"}]},{"featureType":"landscape","elementType":"all","stylers":[{"hue":"#ffffff"},{"saturation":-100},{"lightness":100},{"visibility":"simplified"}]},{"featureType":"poi","elementType":"all","stylers":[{"hue":"#ffffff"},{"saturation":-100},{"lightness":100},{"visibility":"off"}]},{"featureType":"road","elementType":"geometry","stylers":[{"hue":"#bbc0c4"},{"saturation":-93},{"lightness":31},{"visibility":"simplified"}]},{"featureType":"road","elementType":"labels","stylers":[{"hue":"#bbc0c4"},{"saturation":-93},{"lightness":31},{"visibility":"on"}]},{"featureType":"road.arterial","elementType":"labels","stylers":[{"hue":"#bbc0c4"},{"saturation":-93},{"lightness":-2},{"visibility":"simplified"}]},{"featureType":"road.local","elementType":"geometry","stylers":[{"hue":"#e9ebed"},{"saturation":-90},{"lightness":-8},{"visibility":"simplified"}]},{"featureType":"transit","elementType":"all","stylers":[{"hue":"#e9ebed"},{"saturation":10},{"lightness":69},{"visibility":"on"}]},{"featureType":"water","elementType":"all","stylers":[{"hue":"#e9ebed"},{"saturation":-78},{"lightness":67},{"visibility":"simplified"}]}],
            retro : [{"featureType":"administrative","stylers":[{"visibility":"off"}]},{"featureType":"poi","stylers":[{"visibility":"simplified"}]},{"featureType":"road","elementType":"labels","stylers":[{"visibility":"simplified"}]},{"featureType":"water","stylers":[{"visibility":"simplified"}]},{"featureType":"transit","stylers":[{"visibility":"simplified"}]},{"featureType":"landscape","stylers":[{"visibility":"simplified"}]},{"featureType":"road.highway","stylers":[{"visibility":"off"}]},{"featureType":"road.local","stylers":[{"visibility":"on"}]},{"featureType":"road.highway","elementType":"geometry","stylers":[{"visibility":"on"}]},{"featureType":"water","stylers":[{"color":"#84afa3"},{"lightness":52}]},{"stylers":[{"saturation":-17},{"gamma":0.36}]},{"featureType":"transit.line","elementType":"geometry","stylers":[{"color":"#3f518c"}]}],
            dark : [{featureType: 'all',  stylers: [{ hue: '#ff1a00' },{ invert_lightness: true },{ saturation: -100  },{ lightness: 33 },{ gamma: 0.5 }]}],
            pink : [{"stylers": [{ "hue": "#ff61a6" },{ "visibility": "on" },{ "invert_lightness": true },{ "saturation": 40 },{ "lightness": 10 }]}],
            lightGray : [{"featureType": "water","elementType": "geometry.fill","stylers": [{ "color": "#d3d3d3" }]},{"featureType": "transit","stylers": [{ "color": "#808080" },{ "visibility": "off" }]},{"featureType": "road.highway","elementType": "geometry.stroke","stylers": [{ "visibility": "on" },{ "color": "#b3b3b3" }]},{"featureType": "road.highway","elementType": "geometry.fill","stylers": [{ "color": "#ffffff" }]},{"featureType": "road.local","elementType": "geometry.fill","stylers": [{ "visibility": "on" },{ "color": "#ffffff" },{ "weight": 1.8 }]},{"featureType": "road.local","elementType": "geometry.stroke","stylers": [{ "color": "#d7d7d7" }]},{"featureType": "poi","elementType": "geometry.fill","stylers": [{ "visibility": "on" },{ "color": "#ebebeb" }]},{"featureType": "administrative","elementType": "geometry","stylers": [{ "color": "#a7a7a7" }]},{"featureType": "road.arterial","elementType": "geometry.fill","stylers": [{ "color": "#ffffff" }]},{"featureType": "road.arterial","elementType": "geometry.fill","stylers": [{ "color": "#ffffff" }]},{"featureType": "landscape","elementType": "geometry.fill","stylers": [{ "visibility": "on" },{ "color": "#efefef" }]},{"featureType": "road","elementType": "labels.text.fill","stylers": [{ "color": "#696969" }]},{"featureType": "administrative","elementType": "labels.text.fill","stylers": [{ "visibility": "on" },{ "color": "#737373" }]},{"featureType": "poi","elementType": "labels.icon","stylers": [{ "visibility": "off" }]},{"featureType": "poi","elementType": "labels","stylers": [{ "visibility": "off" }]},{"featureType": "road.arterial","elementType": "geometry.stroke","stylers": [{ "color": "#d6d6d6" }]},{"featureType": "road","elementType": "labels.icon","stylers": [{ "visibility": "off" }]},{},{"featureType": "poi","elementType": "geometry.fill","stylers": [{ "color": "#dadada" }]}]
        };
        var self = this,
            defaults = {
                appendTo: '.show-map',
                style: 'none',
                center: [21.036697, 105.834871],
                autoCenter: false,
                zoom: 12,
                changeIcon: true,
                iconMarker: 'images/marker.png',
                iconMarkerActive: 'images/marker-active.png',
                scrollwheel: true,
                // Callback
                init: function(){},
                resize: function () {},
                changeMarker: function(){},
                scroll: function(){}
            },
            data = $(self).data(),
            options = $.extend(defaults, data);

        options = $.extend(options, opts);

        var arrLocation = [], listLocation = [], listMarkers = [], map, mapOption = {}, $mapAppend, $children,
            mapExtend = {
            $el: self,
            options: options,
            initMap: function() {
                var _this = this;
                _this.createMap();
                _this.getMarkers();
                _this.setMarkers();
                _this.eventsMap();
                _this.resizeMap();

                // Apply callback
                _this.options.init(_this);
            },
            createMap: function () {
                var _this = this;
                mapOption = {
                    zoom: _this.options.zoom,
                    scrollwheel: _this.options.scrollwheel,
                    center:  new google.maps.LatLng(_this.options.center[0], _this.options.center[1]),
                    styles: $.styles[_this.options.style]
                };

                // Check autoCenter
                if (_this.options.autoCenter && _this.$el.children().eq(0).data('latlong')) {
                    var latLong = _this.$el.children().eq(0).data('latlong');

                        mapOption.center = new google.maps.LatLng(latLong.split(',')[0], latLong.split(',')[1]);
                }
                if ($(_this.options.appendTo).length) {
                    $mapAppend = $(_this.options.appendTo).eq(0);
                }
                // get children $el
                $children = _this.$el.children();
                map = new google.maps.Map($mapAppend[0], mapOption);

            },
            getMarkers: function () {
                var _this = this,
                    i = 0;

                $.each($children, function () {
                    if ($(this).data('latlong')) {
                        var latLong = $(this).data('latlong'),
                            arrlatLongItem = latLong.split(',');
                        arrLocation[i] = [arrlatLongItem[0], arrlatLongItem[1]];
                        arrLocation[i] = {
                            lat: arrlatLongItem[0],
                            long: arrlatLongItem[1],
                            title: $(this).data('title')
                        };
                        listLocation[i] = new google.maps.LatLng(arrLocation[i].lat, arrLocation[i].long);
                        $(this).data('index-location', i);
                        i++;
                    }
                });
            },
            setMarkers: function (){
                var _this = this;
                $.each(listLocation, function (index, value) {

                    listMarkers[index] = new google.maps.Marker ({
                        map: map,
                        icon: _this.options.iconMarker,
                        position: value
                    });
                })
            },
            eventsMap: function (){
                var _this = this;
                $.each(listMarkers, function (id, value) {
                    var marker = this;
                    google.maps.event.addListener( this, 'click', function () {
                        if (_this.options.changeIcon) {
                            var icon = marker.getIcon();

                            // Remove active icon
                            $.each(listMarkers, function (index, temp) {
                                if (index != id)
                                    this.setIcon(_this.options.iconMarker);
                            });
                            if (icon == _this.options.iconMarker) {
                                marker.setIcon(_this.options.iconMarkerActive);
                            }
                            map.panTo(listLocation[id]);
                        }

                        // Trigger add Class active
                        var latLong = arrLocation[id].lat + ',' + arrLocation[id].long;
                        _this.$el.children('[data-latlong="'+ latLong +'"]').trigger('change');

                    });
                });
                _this.$el.children().click(function (){
                    if ($(this).data('index-location') != undefined) {
                        var index = $(this).data('index-location');

                        google.maps.event.trigger (listMarkers[index], 'click');
                        $(this).trigger('change')
                    }
                });
                _this.$el.children().change( function () {
                    $('.map-active', _this.$el).removeClass('map-active');
                    $(this).addClass('map-active');
                });

            },
            resizeMap: function() {
                var _this = this;
                $(window).resize( function () {
                    // Apply callback resize map
                    _this.options.resize();
                });
            }
        }
        return mapExtend.initMap();
    }

})(jQuery)