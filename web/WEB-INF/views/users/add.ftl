<html>
<head><title>ViralPatel.net - FreeMarker Spring MVC Hello World</title>
<body>
    <table>
        <tr>
            <th>Firstname</th>  <th>Lastname</th>
        </tr>
    <#list model["userList"] as user>
        <tr>
            <td>${user.firstname}</td> <td>${user.lastname}</td>
        </tr>
    </#list>
    </table>


</body>
</html>  