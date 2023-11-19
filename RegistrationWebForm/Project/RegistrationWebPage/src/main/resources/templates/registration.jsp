<!DOCTYPE html>
<html>
<head>
    <title>Employee Registration</title>
</head>
<body>
    <h1>Employee Registration</h1>
    <form action="register" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" required><br>
        
        <label for="dob">Date of Birth:</label>
        <input type="date" name="dob" required><br>
        
        <label for="gender">Gender:</label>
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female<br>
        
        <label for="address">Address:</label>
        <input type="text" name="address" required><br>
        
        <label for="city">City:</label>
        <input type="text" name="city" required><br>
        
        <label for="state">State:</label>
        <input type="text" name="state" required><br>
        
        <label for="loginId">Login ID:</label>
        <input type="text" name="loginId" required><br>
        
        <label for="password">Password:</label>
        <input type="password" name="password" required><br>
        
        <input type="submit" value="Register">
    </form>
</body>
</html>
