<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>BHAA Registration Member</title>
    <jsp:include page="/WEB-INF/jsp/header.jsp"/>
</head>

<body>
<div class="container">
<jsp:include page="/WEB-INF/jsp/menu.jsp"/>
    <div class="panel-heading">
        <h3>Register BHAA Members</h3>
    </div>

    <div class="panel-body">
        <div class="row">
            <div class="ui-widget input-group col-md-12">
                <input type="text" id="memberfilter" class="search-query form-control" placeholder="Search by Name or ID"/>
            </div>
        </div>
    </div>

    <div class="row">
        <form>
            <fieldset name="race" class="col-md-4" type="fieldset" >
                <div class="form-group">
                    <label for="bhaa_racenumber" class="form-label">Race Number</label>
                    <input id="bhaa_racenumber" type="text" class="form-control" name="bhaa_racenumber" value="">
                </div>

            </fieldset>
            <fieldset name="runner" class="col-md-4" type="fieldset">
                <div class="form-group">
                    <label for="bhaa_firstname" class="form-label">First Name</label>
                    <input id="bhaa_firstname" type="text" class="form-control" name="bhaa_firstname" value="">
                </div>
            </fieldset>
            <fieldset name="other" class="col-md-4" type="fieldset">
                <div class="form-group">
                    <label for="bhaa_id" class="form-label">BHAA ID</label>
                    <input id="bhaa_id" type="text" class="form-control" name="bhaa_id" value="">
                </div>
            </fieldset>
            <input id="formSubmitButton" type="submit" class="btn btn-default" value="Register Runner" typeof="button" />
        </form>
    </div>

</div>
<script src="/webjars/jquery/2.2.4/jquery.min.js"></script>
<script src="/webjars/jquery-ui/1.12.1/jquery-ui.min.js"></script>
<script src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
//<![CDATA[
var members = <c:import url="${pageContext.request.contextPath}/dynamic/members.json"/>
//]]>
</script>
<script src="${pageContext.request.contextPath}/js/autocomplete.js"></script>
</body>
</html>