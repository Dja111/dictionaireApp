<!DOCTYPE html>
<html lang="en">
<head>
    <title> Die gemerkteList </title>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
		<!--<link rel="stylesheet" media="screen" type="text/css" title="page_web" href="welcome.css"/>-->

	<#include "css/welcome.ftl">

</head>

<body>

<!--header-->
<header  style="background-color:green">

    <div class="container">

        <h1 align="center" color="red" > VERONIKA DICTAppLICATION </h1>

    </div>

</header>

<section style="margin-left 50px, margin-right: 50px">
<table cellspacing="30">
    <tr>
        
		
        <th>Wort</th>
		
       
	   
	   <th>Bedeutung</th>

    </tr>
	<#list list as answer>
	<tr>

        
		
        <td>${answer.wort}</td>
		
		
		<td>${answer.bedeutung}</td>
        
    </tr>
	</#list>
</table>

</section>

<!--Footer-->
    <footer class="footer-bs" style="margin-top: 110px">
        <div class="row">
        	<div class="col-md-3 footer-brand animated fadeInLeft">
            	<h2>VERONIKA DICTAppLICATION</h2>
                <img src="dictApp.jpeg">
                <p>© 2014 BS3 UI Kit, All rights reserved</p>
            </div>
        	<div class="col-md-4 footer-nav animated fadeInUp">
            	<h4>Menu —</h4>
            	<div class="col-md-6">
                    <ul class="pages">
                        <li><a href="https://www.voyages-sncf.com" target="_blank">Travel</a></li>
                        <li><a href="#">Nature</a></li>
                        <li><a href="#">Explores</a></li>
                        <li><a href="http://www.sciencemag.org/" target="_blank">Science</a></li>
                        <li><a href="#">Advice</a></li>
                    </ul>
                </div>
            	<div class="col-md-6">
                    <ul class="list">
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Contacts</a></li>
                        <li><a href="#">Terms & Condition</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                    </ul>
                </div>
            </div>
        	<div class="col-md-2 footer-social animated fadeInDown">
            	<h4>Follow Us</h4>
            	<ul>
                	<li><a href="https://www.facebook.com/Aurele-Donfack-254870211263148/" target="_blank">Facebook</a></li>
                	<li><a href="#">Twitter</a></li>
                	<li><a href="#">Instagram</a></li>
                	<li><a href="#">RSS</a></li>
                </ul>
            </div>
        	<div class="col-md-3 footer-ns animated fadeInRight">
            	<h4>Newsletter</h4>
                <p>A rover wearing a fuzzy suit doesn’t alarm the real penguins</p>
                <p>
                    <div class="input-group">
                      <input type="text" class="form-control" placeholder="Search for...">
                      <span class="input-group-btn">
                        <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-envelope"></span></button>
                      </span>
                    </div><!-- /input-group -->
                 </p>
            </div>
        </div>
    </footer>

    <!--/Footer Links-->

    <!--Copyright-->
    <div class="footer-copyright py-3 text-center">
        © 2018 Copyright:
        <a href="https://mdbootstrap.com/material-design-for-bootstrap/"> MDBootstrap.com </a>
    </div>
    <!--/Copyright-->

</footer>


</body>
</html> 
