 <!DOCTYPE html>
<html lang="en">
<head>
  <title>Default Page</title>
  <meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>

  <!--header--> 
        <header>
            
            <div class="container">

            <h1 align="center" color="red" > VERONIKA DICTApp </h1> 
   
            </div>

	</header>	

  <!--section-->
  
  <section  style="background-color: bleu">
		
	<div class="container">
	
	 <form method ="POST" action ="action=merken">
  <div class="form-group">
   
  <input type="text" name="text" class="form-control" id="wort" placeholder=" wort eingeben auf deutsch">
  </div>
  <div class="form-group">
    
   <input type="text" name ="text" class="form-control" id="bedeutung" placeholder=" bedeutung eingeben auf French">
  </div>
  
  <button type="submit" class="btn btn-default">merken</button>
</form> 

	</div>
	  
	  <div>
		  <form class="navbar-form navbar-right" method="post" action="action=such">
      <div class="form-group">
        <input type="text" name="text" class="form-control" placeholder=" word auf deutsch eingeben">
      </div>
      <button type="submit" name="submit" class="btn btn-default">suchen</button>
    </form>   
	
	  </div>
	
	
	  <div class="container">
	<form method="POST" action="">
	
	<button type="button" name="submit" class="btn btn-default">gemerteList</button>
		  
	  </div>
	  
	</form>

 </section>




<!--Footer-->
<footer class="page-footer font-small indigo pt-0">

    <!--Footer Links-->
    <div class="container">

        <!--First row-->
        <div class="row">

            <!--First column-->
            <div class="col-md-12 py-5">

                <div class="mb-5 flex-center">

                    <!--Facebook-->
                    <a class="fb-ic">
                        <i class="fa fa-facebook fa-lg white-text mr-md-5 mr-3 fa-2x"> </i>
                    </a>
                    <!--Twitter-->
                    <a class="tw-ic">
                        <i class="fa fa-twitter fa-lg white-text mr-md-5 mr-3 fa-2x"> </i>
                    </a>
                    <!--Google +-->
                    <a class="gplus-ic">
                        <i class="fa fa-google-plus fa-lg white-text mr-md-5 mr-3 fa-2x"> </i>
                    </a>
                    <!--Linkedin-->
                    <a class="li-ic">
                        <i class="fa fa-linkedin fa-lg white-text mr-md-5 mr-3 fa-2x"> </i>
                    </a>
                    <!--Instagram-->
                    <a class="ins-ic">
                        <i class="fa fa-instagram fa-lg white-text mr-md-5 mr-3 fa-2x"> </i>
                    </a>
                    <!--Pinterest-->
                    <a class="pin-ic">
                        <i class="fa fa-pinterest fa-lg white-text fa-2x"> </i>
                    </a>
                </div>
            </div>
            <!--/First column-->
        </div>
        <!--/First row-->
    </div>
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
