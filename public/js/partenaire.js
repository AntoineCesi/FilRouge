/**
 * Date: 18/08/13
 */

function editableTableAdsresses(){
    $('#addresses a').editable({
        url: '',
        title: 'Enter comments',
        emptytext: 'Zone de saisie'
    }).on('save', function(e, params) {
            //put the new value in input hidden
            $(this).parent().children("input").val(params.newValue);
        });
}

var source   = $("#entry-template").html();
var template = Handlebars.compile(source);

$('#add-btn').click(function() {
    var indexTr = {indexTr:$("#addresses>tbody>tr").size(),partenaire_id:$("#idObject").val()};
    $("#addresses>tbody").append(template(indexTr));
    editableTableAdsresses();
});



