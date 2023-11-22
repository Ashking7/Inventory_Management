<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <form action = "addRawMaterial" >
  						<centre>
                        <div class="form-floating mb-3">
                        <label for="id">Product Id</label><br>
                            <input type="number" class="form-control" id="id" placeholder="Enter Id" name="id">
                            
                        </div>
                        <div class="form-floating mb-3">
                        <label for="pname"> Product Name</label><br>
                            <input type="text" class="form-control" id="pname" placeholder="Enter Product Name" name="pname">
                            
                        </div>
                       
                        <div class="form-floating mb-4">
                        <label for="quantity">Quantity</label><br>
                            <input type="text" class="form-control" id="quantity" placeholder="Enter Quantity" name="quantity">
                        
                       <div class="form-floating mb-3">
                       <label for="unit">Unit</label><br>
                            <input type="text" class="form-control" id="unit" placeholder="unit in pcs,kg" name="unit">
                            
                        </div>
                        <div class="form-floating mb-3">
                         <label for="cost">Cost</label><br>
                            <input type="number" class="form-control" id="cost" placeholder="cost" name="cost">
                           <br>
                        </div>
                        <button type="submit" class="btn btn-primary py-3 w-100 mb-4">Add Raw Material</button>
                       </div>
                       </centre>
                        </form>

</body>
</html>