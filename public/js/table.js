/**
 * Date: 18/08/13
 */

var source   = $("#entry-template").html();
var template = Handlebars.compile(source);

function editableTable(idTable){
    $('#' + idTable + ' a').editable({
        url: '',
        title: 'Enter comments',
        emptytext: 'Zone de saisie'
    }).on('save', function(e, params) {
            //put the new value in input hidden
            $(this).parent().children("input").val(params.newValue);
        });
}
$('#add-btn-commande').click(function() {
    var indexTr = {indexTr:$('#' + 'CompositionCommande' + ">tbody>tr").size(),parentId:$("#idObject").val()};
    $('#' + 'CompositionCommande' + ">tbody").append(template(indexTr));
    editableTable('CompositionCommande');
});

$('#add-btn').click(function() {
    var indexTr = {indexTr:$('#' + 'addresses' + ">tbody>tr").size(),parentId:$("#idObject").val()};
    $('#' + 'addresses' + ">tbody").append(template(indexTr));
    editableTable('addresses');
});






