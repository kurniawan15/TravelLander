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



function formatAMPM() {
var d = new Date(),
    months = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'],
    days = ['Sun','Mon','Tue','Wed','Thu','Fri','Sat'];
return days[d.getDay()]+' '+months[d.getMonth()]+' '+d.getDate()+' ';
}


function FungsiFilter() 
{
        var input, filter, table, tr, td, i;
        input = formatAMPM();
        alert(input);
        filter = input.value.toUpperCase();
        table = document.getElementById("TabelFilter");
        tr = table.getElementsByTagName("tr");

        for (i = 0; i < tr.length; i++) {
          td = tr[i].getElementsByTagName("td")[2];
          if (td) {
            if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
              tr[i].style.display = "";
            } else {
              tr[i].style.display = "none";
            }
          } 
        }
}

