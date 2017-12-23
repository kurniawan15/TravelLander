window.onload = function () {
  var chart = new CanvasJS.Chart("chartContainer",
  {

    title:{
    text: "Statistika Kehadiran pada setiap Bulan"
    },
    axisX: {
      valueFormatString: "MMM",
      interval:1,
      intervalType: "month"
    },
    axisY:{
      includeZero: false

    },
    data: [
    {
      type: "line",

      dataPoints: [
      { x: new Date(2012, 00, 1), y: 3 },
      { x: new Date(2012, 01, 1), y: 5},
      { x: new Date(2012, 02, 1), y: 10, indexLabel: "highest",markerColor: "red", markerType: "triangle"},
      { x: new Date(2012, 03, 1), y: 3 },
      { x: new Date(2012, 04, 1), y: 2 },
      { x: new Date(2012, 05, 1), y: 2 },
      { x: new Date(2012, 06, 1), y: 1 },
      { x: new Date(2012, 07, 1), y: 4 },
      { x: new Date(2012, 08, 1), y: 0 , indexLabel: "lowest",markerColor: "DarkSlateGrey", markerType: "cross"},
      { x: new Date(2012, 09, 1), y: 1 },
      { x: new Date(2012, 10, 1), y: 3 },
      { x: new Date(2012, 11, 1), y: 4 }
      ]
    }
    ]
  });

  chart.render();
}
