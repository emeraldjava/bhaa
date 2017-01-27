jQuery(document).ready( function() {
	jQuery("#memberfilter").autocomplete({
		source: members,
		minLength: 3,
		source: function (request, response) {
		    var matcher = new RegExp(jQuery.ui.autocomplete.escapeRegex(request.term), "i");
		    response(jQuery.grep(members, function(value) {
		        return matcher.test(value.id) || matcher.test(value.label);
		    }));
		},
		focus: function( event, ui ) {
			jQuery("#memberfilter").val(ui.item.id);
        	return false;
      	},
		select: function(event, ui) {
			jQuery("#bhaa_runner").val( ui.item.id );
			jQuery("#bhaa_firstname").val( ui.item.firstname );
			jQuery("#bhaa_lastname").val( ui.item.lastname );
			jQuery("#bhaa_dateofbirth").val( ui.item.dob );
			jQuery("#bhaa_company").val( ui.item.companyname );
			jQuery("#bhaa_standard").val( ui.item.standard );
			if(ui.item.gender=="M") {
				jQuery("#bhaa_gender-M").prop("checked",true);
			} else {
				jQuery("#bhaa_gender-W").prop("checked",true);
			}
			bootstrap_alert('#form_errors', 'User must dismiss this message manually');
			return false;
		}
	})
	.data("ui-autocomplete")._renderItem = function( ul, item) {
		// http://stackoverflow.com/questions/14442471/how-to-set-up-jquery-ui-1-10-autocomplete-custom-display
		return jQuery("<li>")
			.data("ui-autocomplete-item", item)
	   		.append("<a>"+item.label+" "+item.id+"</a><small>Status:"+item.status+", Company:"+item.companyname+"</small>")
			.appendTo(ul);
	};

	jQuery('#formSubmitButton').click(function() {
		/* when the button in the form, display the entered values in the modal */
		jQuery('#lname').text(jQuery('#bhaa_lastname').val());
		jQuery('#fname').text(jQuery('#bhaa_firstname').val());
	});

	jQuery('#modalsubmit').click(function() {
		/* when the submit button in the modal is clicked, submit the form */
		jQuery('#registerform').submit();
	});
});
