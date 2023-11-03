<%if (session.getAttribute("login")==null){session.setAttribute("login","Login");} else if (session.getAttribute("user")==null) {
    session.setAttribute("login","Login");
} else session.setAttribute("login","Logout"); %>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Adlister</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/logout"><%=session.getAttribute("login")%></a></li>
        </ul>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
