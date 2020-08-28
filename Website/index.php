<?php

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ZuPaty</title>

    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/bootstrap.js"></script>
</head>

<body>
<script>
    const socket = new WebSocket("ws://localhost:8887")

    socket.onopen = function(event) {
        socket.send("moin meister")
    }

    socket.onmessage = function(event) {
        console.log(event.data)
    }
</script>
</body>
</html>