<%--
  Created by IntelliJ IDEA.
  User: Sina
  Date: 1/9/2023
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- External CSS libraries -->
<link type="text/css" rel="stylesheet" href="assets/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="assets/fonts/font-awesome/css/font-awesome.min.css">
<link type="text/css" rel="stylesheet" href="assets/fonts/flaticon/font/flaticon.css">

<!-- Favicon icon -->
<link rel="shortcut icon" href="assets/img/favicon.ico" type="image/x-icon" >

<!-- Custom Stylesheet -->
<link type="text/css" rel="stylesheet" href="assets/css/style.css">

<!-- External JS libraries -->
<script src="assets/js/jquery-3.6.0.min.js"></script>
<script src="assets/js/bootstrap.bundle.min.js"></script>
<script src="assets/js/jquery.validate.min.js"></script>
<script src="assets/js/app.js"></script>
<!-- Custom JS Script -->

<%--persian calender--%>
<link href="https://fonts.googleapis.com/css?family=Material+Icons" rel="stylesheet" type="text/css">
<link href="https://cdn.jsdelivr.net/npm/quasar@^1.0.0/dist/quasar.rtl.min.css" rel="stylesheet" type="text/css">
<script src="https://cdn.jsdelivr.net/npm/vue@^2.0.0/dist/vue.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/quasar@^1.0.0/dist/quasar.umd.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/quasar@^1.0.0/dist/lang/fa-ir.umd.min.js"></script>
<script>Quasar.lang.set(Quasar.lang.faIr)

new Vue({
    el: '#q-app',
    data () {
        return {
            date: '1397/08/12'
        }
    }
})</script>

