/*----------------------------edit buat mav----------------------------------------------*/
    /* global currenTime */

function openSlideMenu(){
      document.getElementById('side-menu').style.height = '90px';
      document.getElementById('logoweb').style.display='inline';
      document.getElementById('main').style.marginLeft = '0px';
      document.getElementById('menu').style.width = '250px';
    }

    function closeSlideMenu(){
      document.getElementById('side-menu').style.height = '0px';
      document.getElementById('main').style.marginLeft = '0';
      document.getElementById('logoweb').style.display='none';
      document.getElementById('menu').style.width = '0px';
    }
    
 
function startTime() {
    var today = new Date();
    var h = today.getHours();
    

    var t = setTimeout(startTime, 500);
    
        if (h >= 4 && h <= 10)
    {
        var salam = document.getElementById("coba");
        salam.innerText = "Good Moring";
    }
       else if (h >= 10 && h <= 18)
    {
        var salam = document.getElementById("coba");
        salam.innerText = "Good Aftrnoon";
    }
       else 
    {
        var salam = document.getElementById("coba");
        salam.innerText = "Good Night";
    }
}
