<html>
<body>
<h2>Hello World!</h2>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
    pageContext.setAttribute("basePath",basePath);    
%>
<p>path=<%=path %></p>
<p>basePath=<%=basePath %></p>
</body>
</html>
