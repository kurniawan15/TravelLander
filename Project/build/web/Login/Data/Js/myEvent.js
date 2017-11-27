/*----------------------------edit buat mav----------------------------------------------*/
    /* global currenTime */

function openSlideMenu(){
<<<<<<< HEAD
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
=======
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
>>>>>>> 67f839e66efc134c4ec3a8994c7349f78efe80a4
    {
        var salam = document.getElementById("coba");
        salam.innerText = "Good Moring";
    }
       else if (h >= 10 && h <= 18)
    {
        var salam = document.getElementById("coba");
        salam.innerText = "Good Aftrnoon";
    }
<<<<<<< HEAD
       else if (h >= 18 && h <= 4)
=======
       else 
>>>>>>> 67f839e66efc134c4ec3a8994c7349f78efe80a4
    {
        var salam = document.getElementById("coba");
        salam.innerText = "Good Night";
    }
<<<<<<< HEAD
 

    setTimeout(renderTime(),1000);
}
renderTime();
=======
}
>>>>>>> 67f839e66efc134c4ec3a8994c7349f78efe80a4
