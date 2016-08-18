<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- saved from url=(0074)http://www.htmlgoodies.com/legacy/beyond/webmaster/projects/7withval2.html -->
<html ><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252">

	
<title>Purchasing Module</title>
 <spring:url var="webTrendsJS" value="/erp-purchasing/po_files/webtrends.min.js"/>
	<script type='text/javascript' src='js/jquery-1.3.2.min.js'></script>

<script src="${ webTrendsJS }"></script>
<script type="text/javascript">


function dm(amount) 
{
  string = "" + amount;
  dec = string.length - string.indexOf('.');
  if (string.indexOf('.') == -1)
  return string + '.00';
  if (dec == 1)
  return string + '00';
  if (dec == 2)
  return string + '0';
  if (dec > 3)
  return string.substring(0,string.length-dec+3);
  return string;
}



function calculate()
{

  QtyA = 0;  QtyB = 0;  QtyC = 0;
  TotA = 0;  TotB = 0;  TotC = 0;

  PrcA = 1.25; PrcB = 2.35; PrcC = 3.45;

 
 
  if (document.ofrm.qtyA.value > "")
     { QtyA = document.ofrm.qtyA.value };
  document.ofrm.qtyA.value = eval(QtyA);  
 
  if (document.ofrm.qtyB.value > "")
     { QtyB = document.ofrm.qtyB.value };
  document.ofrm.qtyB.value = eval(QtyB);  
 
  if (document.ofrm.qtyC.value > "")
     { QtyC = document.ofrm.qtyC.value };
  document.ofrm.qtyC.value = eval(QtyC);
 
 
  TotA = QtyA * PrcA;
  document.ofrm.totalA.value = dm(eval(TotA));
 
  TotB = QtyB * PrcB;
  document.ofrm.totalB.value = dm(eval(TotB));
 
  TotC = QtyC * PrcC;
  document.ofrm.totalC.value = dm(eval(TotC));
 
 
  Totamt = 
     eval(TotA) +
     eval(TotB) +
     eval(TotC) ;
    
  document.ofrm.GrandTotal.value = dm(eval(Totamt));
  
} 


function validNum(theForm)
{
  var checkOK = "0123456789.,";
  var checkStr = theForm.qtyA.value;
  var allValid = true;
  var validGroups = true;
  var decPoints = 0;
  var allNum = "";
  for (i = 0;  i < checkStr.length;  i++)
  {
    ch = checkStr.charAt(i);
    for (j = 0;  j < checkOK.length;  j++)
      if (ch == checkOK.charAt(j))
        break;
    if (j == checkOK.length)
    {
      allValid = false;
      break;
    }
    if (ch == ".")
    {
      allNum += ".";
      decPoints++;
    }
    else if (ch == "," && decPoints != 0)
    {
      validGroups = false;
      break;
    }
    else if (ch != ",")
      allNum += ch;
  }
  if (!allValid)
  {
    alert("Please enter only digit characters in the \"Class A quantity\" field.");
    theForm.qtyA.focus();
    return (false);
  }

  if (decPoints > 1 || !validGroups)
  {
    alert("Please enter a valid number in the \"Class A quantity\" field.");
    theForm.qtyA.focus();
    return (false);
  }

  var checkOK = "0123456789.,";
  var checkStr = theForm.qtyB.value;
  var allValid = true;
  var validGroups = true;
  var decPoints = 0;
  var allNum = "";
  for (i = 0;  i < checkStr.length;  i++)
  {
    ch = checkStr.charAt(i);
    for (j = 0;  j < checkOK.length;  j++)
      if (ch == checkOK.charAt(j))
        break;
    if (j == checkOK.length)
    {
      allValid = false;
      break;
    }
    if (ch == ".")
    {
      allNum += ".";
      decPoints++;
    }
    else if (ch == "," && decPoints != 0)
    {
      validGroups = false;
      break;
    }
    else if (ch != ",")
      allNum += ch;
  }
  if (!allValid)
  {
    alert("Please enter only digit characters in the \"Class B quantity\" field.");
    theForm.qtyB.focus();
    return (false);
  }

  if (decPoints > 1 || !validGroups)
  {
    alert("Please enter a valid number in the \"Class B quantity\" field.");
    theForm.qtyA.focus();
    return (false);
  }

  var checkOK = "0123456789.,";
  var checkStr = theForm.qtyC.value;
  var allValid = true;
  var validGroups = true;
  var decPoints = 0;
  var allNum = "";
  for (i = 0;  i < checkStr.length;  i++)
  {
    ch = checkStr.charAt(i);
    for (j = 0;  j < checkOK.length;  j++)
      if (ch == checkOK.charAt(j))
        break;
    if (j == checkOK.length)
    {
      allValid = false;
      break;
    }
    if (ch == ".")
    {
      allNum += ".";
      decPoints++;
    }
    else if (ch == "," && decPoints != 0)
    {
      validGroups = false;
      break;
    }
    else if (ch != ",")
      allNum += ch;
  }
  if (!allValid)
  {
    alert("Please enter only digit characters in the \"Class C quantity\" field.");
    theForm.qtyC.focus();
    return (false);
  }

  if (decPoints > 1 || !validGroups)
  {
    alert("Please enter a valid number in the \"Class C quantity\" field.");
    theForm.qtyC.focus();
    return (false);
  }


  calculate();
  return (true);
} 



</script>
<script type="text/javascript">
$(document).ready(function() {

	  
	   
	  $("#addrow").click(function(){
	    $(".item-row:last").after('<tr class="item-row"><td width="250">Class "A" Widgets</td><td align="center" width="100"><input type="text" name="qtyA" size="5" tabindex="5" onchange="return validNum(document.ofrm)" ></td><td align="right" width="60">1.25</td><td align="right" width="140"><input type="text" name="totalA" size="12" tabindex="99" onchange="calculate()" ></td></tr>');
	    if ($(".delete").length > 0) $(".delete").show();
	 
	  });
	  
	 
	  
	  
	  
	});
</script>


   
</head>

<body bgcolor="#FFFFCC">

<h2>Packt ERP</h2>
<h3>Purchasing Module</h3>


<form method="POST" action="http://www.htmlgoodies.com/legacy/beyond/webmaster/projects/submitted.html" name="ofrm" >
	<table border="0" cellpadding="0" width="550" id="table1">
		<tbody><tr>
			<td width="340" align="right"><font color="#FF0000">Name</font></td>
			<td width="10">&nbsp;</td>
			<td width="200"><input type="text" name="Name" size="30" tabindex="1" ></td>
		</tr>
		
		<tr>
			<td width="340" align="right"><font color="#FF0000">Email</font> 
			(Your confirmation will be sent here): </td>
			<td width="10">&nbsp;</td>
			<td width="200"><input type="text" name="Email" size="30" tabindex="1" ></td>
		</tr>
		<tr>
			<td width="340" align="right">Other Contact Info:</td>
			<td width="10">&nbsp;</td>
			<td width="200"><input type="text" name="OtherInfo" size="30" tabindex="1"> </td>
		</tr>
		<tr>
			<td width="340" align="right">&nbsp;</td>
			<td width="10">&nbsp;</td>
			<td width="200">&nbsp;</td>
		</tr>
	</tbody></table>
	<p>And tell us what you would like:</p>
	<table border="0" cellpadding="0" width="550" id="table2">
	    <tr id="hiderow">
		    <td colspan="5"><a id="addrow" href="javascript:;" title="Add a row">Add a row</a></td>
		  </tr>
		<tbody>
		<tr>
			<td width="250" height="31"><b>Item Description</b></td>
			<td align="center" width="100" height="31"><b>Quantity</b></td>
			<td align="right" height="31" width="60"><b>Price </b></td>
			<td align="right" height="31" width="140"><b>Total</b></td>
		</tr>
		
		<tr class="item-row">
			<td width="250">Class "A" Widgets</td>
			<td align="center" width="100">
			<input type="text" name="qtyA" size="5" tabindex="5" onchange="return validNum(document.ofrm)" ></td>
			<td align="right" width="60">1.25</td>
			<td align="right" width="140">
			<input type="text" name="totalA" size="12" tabindex="99" onchange="calculate()" ></td>
		</tr>
		<tr class="item-row">
			<td width="250">Class "B" Widgets</td>
			<td align="center" width="100">
			<input type="text" name="qtyB" size="5" tabindex="5" onchange="return validNum(document.ofrm)" ></td>
			<td align="right" width="60">2.35</td>
			<td align="right" width="140">
			<input type="text" name="totalB" size="12" tabindex="99" onchange="calculate()" ></td>
		</tr>
		<tr class="item-row">
			<td width="250">Class "C" Widgets</td>
			<td align="center" width="100">
			<input type="text" name="qtyC" size="5" tabindex="5" onchange="return validNum(document.ofrm)" "></td>
			<td align="right" width="60">3.45</td>
			<td align="right" width="140">
			<input type="text" name="totalC" size="12" tabindex="99" onchange="calculate()" ></td>
		</tr>
		<tr>
			<td width="250">&nbsp;</td>
			<td align="center" width="100">&nbsp;</td>
			<td align="right" width="60">&nbsp;</td>
			<td align="right" width="140">&nbsp;</td>
		</tr>
		<tr>
			<td width="250">
			<p align="right"><b>TOTALS:</b></p></td>
			<td align="center" width="100">&nbsp;</td>
			<td align="right" width="60">&nbsp;</td>
			<td align="right" width="140">
			<input type="text" name="GrandTotal" size="15" tabindex="99" onchange="calculate()" ></td>
		</tr>
		<tr>
			<td width="250">&nbsp;</td>
			<td align="center" width="100">&nbsp;</td>
			<td align="right" width="60">&nbsp;</td>
			<td align="right" width="140">&nbsp;</td>
		</tr>
	</tbody></table>
	<p>&nbsp;</p>
	<table border="0" cellpadding="0" width="550" id="table3">
		<tbody><tr>
			<td width="563">
			<p align="center">
			<input type="submit" value="Submit" name="subButton" tabindex="50" >&nbsp;&nbsp;&nbsp;&nbsp; 
			<input type="reset" value="Reset" name="resetButton" tabindex="50" ></p></td>
		</tr>
	</tbody></table>
</form>


</body></html>