

google.charts.load('current', {'packages':['corechart']});
google.setOnLoadCallback(drawChart);
function drawChart() {

    var data = google.visualization.arrayToDataTable([
        ['Payment_type','Count'],


    var options = {
        title: 'Number of Payments according to their method',
        pieHole: 0.5,
        pieSliceTextStyle: {
            color: 'black',
        },
        legend: 'top',
        is3D: false
    };

    var chart = new google.visualization.PieChart(document.getElementById("PieChart"));

    chart.draw(data,options);
}

function chart() {
    $.ajax({
        "url": "/chart" ,
        "method": "POST",
    })
}

function tabla() {
    $.ajax({
        "url": "/tabla" ,
        "method": "POST",
    })
}