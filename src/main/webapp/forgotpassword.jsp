
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fa">
<head>
    <title>ForgotPassword</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="UTF-8">
    <jsp:include page="assets/Include.jsp"></jsp:include>
</head>
<body id="top" dir="rtl">
<div>
    <form action="/forgotPassword" method="post">
        <div>
            <input name="email" type="email" placeholder="ایمیل را وارد کنید..." aria-label="Email Address">
        </div>
        <div>
            <button type="submit">ارسال لینک بازیابی</button>
        </div>
    </form>
    <p>حساب کاربری ندارید؟ <a href="register.jsp">از اینجا ثبت نام کنید</a></p>
</div>
</body>
</html>

