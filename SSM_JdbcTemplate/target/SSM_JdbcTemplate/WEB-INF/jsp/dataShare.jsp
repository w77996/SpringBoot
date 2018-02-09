<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="keyword" content="">

    <title>数据</title>

    <!-- Custom styles for this web -->
    <link rel="stylesheet" type="text/css" href="/static/css/global.css">

</head>

<body class="card-body">

<section class="view">

    <!--main content start-->
    <div class="main">
        <div class="main-wrap">

            <!--Cards start-->
            <div class="cards">

                <c:when test="${not empty heartRateDataMap}">
                <div class="card">
                    <div class="fl card-info">
                        <p class="fs18 card-title">脉搏</p>
                        <p class="fs24 pl10"><span class="fs24">${heartRateDataMap.heartRate}</span><span class="card-unit">bpm</span><span class="fs24">${heartRateDataMap.status}</span></p>
                        <p class="card-time">测量时间：${heartRateDataMap.timestamp}</p>
                    </div>
                    <img class="fr card-img" src="/static/images/card-pulse.png">
                </div>
                </c:when>

                <c:when test="${not empty heartPressureDataMap}">
                <div class="card">
                    <div class="fl card-info">
                        <p class="fs18 card-title">血压</p>
                        <p class="fs14 pl10">收缩压：${heartPressureDataMap.maxHeartPressure}<span class="card-unit">mmhg</span>${heartPressureDataMap.maxStatus}</p>
                        <p class="fs14 pl10">舒张压：${heartPressureDataMap.minHeartPressure}<span class="card-unit">mmhg</span>${heartPressureDataMap.minStatus}</p>
                        <p class="card-time">测量时间：${heartPressureDataMap.timestamp}</p>
                    </div>
                    <img class="fr card-img" src="/static/images/card-bloodpressure.png">
                </div>
                </c:when>

                <c:when test="${not empty stepDataMap}">
                <div class="card">
                    <div class="fl card-info">
                        <p class="fs18 card-title">步数</p>
                        <p class="fs18 pl10"><span class="fs24">${stepDataMap.step}</span><span class="card-unit">步</span></p>
                    </div>
                    <img class="fr card-img" src="/static/images/card-watch.png">
                </div>
                </c:when>

            </div>
            <!--Cards end-->

            <!--Site info start-->
            <p class="site-info">以上数据来自于健康手环<br>分享时间 ${timestamp}</p>
            <!--Site info end-->

        </div>
    </div>
    <!--main content end-->

</section>

</body>
</html>
