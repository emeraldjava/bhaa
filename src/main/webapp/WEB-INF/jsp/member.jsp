<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <jsp:include page="/WEB-INF/jsp/menu.jsp" />
            <div class="jumbotron">
                <h3>Register BHAA Members</h3>

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
                            <legend>Event Details</legend>
                            <div class="form-group">
                                <label for="bhaa_racenumber" class="form-label">Race Number</label>
                                <input id="bhaa_racenumber" type="text" class="form-control" name="bhaa_racenumber" value="">
                            </div>
                            <div class="form-group">
                                <label class="form-label">Money</label>
                                <div>
                                    <label class="form-label" for="bhaa_money-10"><input id="bhaa_money-10" name="bhaa_money" type="radio" class="radio-inline" value="10"/>10e Member</label>
                                </div>
                                <div>
                                    <label class="form-label" for="bhaa_money-25"><input id="bhaa_money-25" name="bhaa_money" type="radio" class="radio-inline" value="25"/>25e Renew</label>
                                </div>
                                <div>
                                    <label class="form-label" for="bhaa_money-20"><input id="bhaa_money-20" name="bhaa_money" type="radio" class="radio-inline" value="20"/>20e Day</label>
                                </div>
                            </div>
                            <div>
                                <input id="formSubmitButton" type="submit" class="btn btn-default" value="Register Runner" typeof="button" />
                            </div>

                        </fieldset>
                        <fieldset name="runner" class="col-md-4" type="fieldset">
                            <legend>Athlete Details</legend>
                            <div class="form-group">
                                <label for="bhaa_firstname" class="form-label">First Name</label>
                                <input id="bhaa_firstname" type="text" class="form-control" value="">
                            </div>
                            <div class="form-group">
                                <label for="bhaa_lastname" class="form-label">Last Name</label>
                                <input id="bhaa_lastname" type="text" class="form-control" value="">
                            </div>
                            <div class="form-group">
                                <label for="bhaa_dateofbirth" class="form-label">Date Of Birth</label>
                                <input id="bhaa_dateofbirth" type="text" class="form-control" value="">
                            </div>
                            <div class="form-group">
                                <label class="form-label">Gender</label>
                                <div>
                                    <label for="bhaa_gender-M" class="form-label"><input id="bhaa_gender-M" name="bhaa_gender" type="radio" class="radio-inline" value="M"/>Male</label>
                                </div>
                                <div>
                                    <label for="bhaa_gender-F" class="form-label"><input id="bhaa_gender-F" name="bhaa_gender" type="radio" class="radio-inline" value="M"/>Female</label>
                                </div>
                            </div>
                        </fieldset>
                        <fieldset name="other" class="col-md-4" type="fieldset">
                            <legend>BHAA Details</legend>
                            <div class="form-group">
                                <label for="bhaa_runner" class="form-label">BHAA ID</label>
                                <input id="bhaa_runner" type="text" class="form-control" value="">
                            </div>
                            <div class="form-group">
                                <label for="bhaa_company" class="form-label">Company</label>
                                <input id="bhaa_company" type="text" class="form-control" value="">
                            </div>
                            <div class="form-group">
                                <label for="bhaa_standard" class="form-label">Standard</label>
                                <input id="bhaa_standard" type="text" class="form-control" value="">
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>

<%--<script src="/webjars/jquery/2.2.4/jquery.min.js"></script>--%>
<%--<script src="/webjars/jquery-ui/1.12.1/jquery-ui.min.js"></script>--%>
<%--<script src="/webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
<%--</body>--%>
<%--</html>--%>

</div>
</div>
</div>
<jsp:include page="/WEB-INF/jsp/footer.jsp"/>
<script type="text/javascript">
    //<![CDATA[
    var members = <c:import url="${pageContext.request.contextPath}/dynamic/members-list-2017-01-27.json"/>
    //]]>
</script>
<script src="${pageContext.request.contextPath}/js/autocomplete.js"></script>
</body>
</html>