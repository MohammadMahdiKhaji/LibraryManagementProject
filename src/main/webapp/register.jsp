<%--
  Created by IntelliJ IDEA.
  User: Sina
  Date: 1/9/2023
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fa">

<head>
    <title>SignUp</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="UTF-8">
    <jsp:include page="assets/Include.jsp"></jsp:include>
</head>
<body id="top" dir="rtl">
<div>
    <form action="/signup" method="post">
        <div>
                            <input name="username" type="text" placeholder="نام کاربری" aria-label="Full Name">
                        </div>
        <div>
                            <input name="password" type="password" autocomplete="off" placeholder="رمز عبور" aria-label="Password">
                        </div>
        <div>
                            <input name="firstname" type="text" placeholder="نام" aria-label="Full Name">
                        </div>
        <div>
                            <input name="lastname" type="text" placeholder="نام خانوادگی" aria-label="Full Name">
                        </div>
        <div>
                            <input name="email" type="email" placeholder="پست الکترونیکی" aria-label="Email Address">
                        </div>
        <div>
                            <input name="birthdate" type="date" placeholder="تاریخ تولد" aria-label="BirthDate">
                        </div>
        <div>
                            <select id="country-state" name="state">
                                <option value="32">Alborz Province</option>
                                <option value="03">Ardabil Province</option>
                                <option value="06">Bushehr Province</option>
                                <option value="08">Chaharmahal and Bakhtiari Province</option>
                                <option value="01">East Azerbaijan Province</option>
                                <option value="14">Fars Province</option>
                                <option value="19">Gilan Province</option>
                                <option value="27">Golestan Province</option>
                                <option value="23">Hormozgan Province</option>
                                <option value="05">Ilam Province</option>
                                <option value="04">Isfahan Province</option>
                                <option value="15">Kerman Province</option>
                                <option value="17">Kermanshah Province</option>
                                <option value="10">Khuzestan Province</option>
                                <option value="18">Kohgiluyeh and Boyer-Ahmad Province</option>
                                <option value="16">Kurdistan Province</option>
                                <option value="20">Lorestan Province</option>
                                <option value="22">Markazi Province</option>
                                <option value="21">Mazandaran Province</option>
                                <option value="31">North Khorasan Province</option>
                                <option value="28">Qazvin Province</option>
                                <option value="26">Qom Province</option>
                                <option value="30">Razavi Khorasan Province</option>
                                <option value="12">Semnan Province</option>
                                <option value="13">Sistan and Baluchestan</option>
                                <option value="29">South Khorasan Province</option>
                                <option value="07">Tehran Province</option>
                                <option value="02">West Azarbaijan Province</option>
                                <option value="25">Yazd Province</option>
                                <option value="11">Zanjan Province</option>
                            </select>
                        </div>
        <div>
                            <button type="submit">ثبت نام</button>
                        </div>
    </form>
    <p>حساب کاربری دارید؟ <a href="login.jsp">از اینجا وارد شوید</a></p>
</div>
</body>
</html>
