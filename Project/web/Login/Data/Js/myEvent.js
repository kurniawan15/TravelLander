/*----------------------------edit buat mav----------------------------------------------*/
    /* global currenTime */

function openSlideMenu(){
      document.getElementById('side-menu').style.width = '250px';
      document.getElementById('main').style.marginLeft = '250px';
    }

    function closeSlideMenu(){
      document.getElementById('side-menu').style.width = '0';
      document.getElementById('main').style.marginLeft = '0';
    }
    
 
function renderTime()
{
    var currentTime = new Date();
    var h = currentTime.getHours();
    
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
       else if (h >= 18 && h <= 4)
    {
        var salam = document.getElementById("coba");
        salam.innerText = "Good Night";
    }
 

    setTimeout(renderTime(),1000);
}
renderTime();