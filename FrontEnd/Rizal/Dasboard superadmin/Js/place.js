// JavaScript Document
 	google.maps.event.addDomListener(window, 'load', intilize);
    function intilize() 
	{
        var autocomplete = new google.maps.places.Autocomplete(document.getElementById("txtautocomplete"));

        google.maps.event.addListener(autocomplete, 'place_changed', function () {

        var place = autocomplete.getPlace();
        var location = "Address: " + place.formatted_address + "<br/>";
        location += "Latitude: " + place.geometry.location.A + "<br/>";
        location += "Longitude: " + place.geometry.location.F;
        document.getElementById('lblresult').innerHTML = location
        });

    };