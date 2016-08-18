 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <!-- header -->
      <header>
        <h1><a href="index.html" id="logo"><spring:message code="hms_header" /></a></h1>
        <div class="department"> 9863 - 9867 Mill Road, LA, MG09 99HT<br>
          <span><spring:message code="hms_free_phone" />: &nbsp; +1 800 559 6580</span> </div>
      </header>
      <div class="box">
        <nav>
          <ul id="menu">
            <c:url value="/hms/index?theme=main" var="index"/>
            <c:url value="/hms/locations?theme=locations" var="locations"/>
            <c:url value="/hms/rooms?theme=rooms" var="rooms"/>
            <c:url value="/hms/services?theme=services" var="services"/>
            <c:url value="/hms/booking?theme=booking" var="booking"/>
            <li class="active"><a href='<c:out value="${ index }"/>'><spring:message code="hms_about" /></a></li>
            <li><a href='<c:out value="${ services }"/>'><spring:message code="hms_service" /></a></li>
            <li><a href='<c:out value="${ booking }"/>'><spring:message code="hms_booking" /></a></li>
            <li><a href='<c:out value="${ rooms }"/>'><spring:message code="hms_rooms" /></a></li>
            <li><a href='<c:out value="${ locations }"/>'><spring:message code="hms_locations" /></a></li>
          </ul>
        </nav>
        <!-- header end -->
        </div>