<%-- 
    Document   : home.jsp
    Created on : 4 Apr, 2018, 1:57:14 PM
    Author     : shreyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"/>
        <title>Gupshup</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">GupShup</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
      <li class="nav-item">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Welcome, <%= session.getAttribute("uname")%></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"><i class="fa fa-user-plus fa-2x"></i></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"><i class="fa fa-globe fa-2x"></i></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"><i class="fa fa-envelope fa-2x"></i></a>
      </li>
    </ul>
  </div>
</nav>
      <div class="container">
          <div class="row">
              <div class="col-6 offset-3">
                  <div class="card mt-5">
                      <img class="card-img-top" src="https://images.pexels.com/photos/56866/garden-rose-red-pink-56866.jpeg?auto=compress&cs=tinysrgb&h=350" alt="Card image cap">
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                      </div>
                   </div>
              </div>
          </div>
      </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
		integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		crossorigin="anonymous"></script>
    <script>
        
        $(function(){
    $.get("loadpost.jsp",
    {},
    function(data, success){
        alert(data);
    }
    );
});
    </script>
</html>
