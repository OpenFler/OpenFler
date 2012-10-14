<html>
<head><title>ViralPatel.net - FreeMarker Spring MVC Hello World</title>
<body>
    <table>
        <tr>
            <th>user show</th> 
        </tr>
    <#list model["userList"] as user>
        <tr>
            <td>${user.firstname}</td> 
        </tr>
    </#list>
    </table>


</body>
</html>  