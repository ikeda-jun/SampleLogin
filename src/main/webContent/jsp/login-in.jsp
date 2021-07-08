<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html"%>
    
<form action="../servlet/Login" method="post">
<p>ID
<input type="text" name="id" required></p>
<p>パスワード
<input type="text" name="password" required></p>
<p><input type="submit" value="ログイン"></p>
</form>

<%@include file="../footer.html"%>