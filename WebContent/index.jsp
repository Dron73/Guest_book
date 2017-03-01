<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Книга отфывзывов</title>
</head>
<body>
	<form method="GET" action="/MyServlet">
		<h1 align="center">Книга отзывов</h1>

		<p>
			<b>Ваше имя:</b><br> <input type="text" size="20" name="firstName">
		</p>

		<p>
			<b>Оценка:</b><br> <select name="evaluation">
				<option selected value="Отлично">Отлично</option>
				<option value="Хорошо">Хорошо</option>
				<option value="Плохо">Пффлохо</option>
			</select>
		</p>

		<p>
			<b>Комментарий:</b><br>
			<textarea name="comment" cols="50" rows="5"></textarea>
		</p>
		<p>
			<input type="submit" value="Отправить"> <input type="reset" value="Очистить">
		</p>
	</form>
</body>
</html>