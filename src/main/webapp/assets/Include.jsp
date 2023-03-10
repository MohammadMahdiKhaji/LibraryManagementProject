
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<script type="text/javascript" src="js/JQuery.js"></script>--%>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>

<script>
    function borrow(activeRecord) {

        if(confirm("Are you sure you want to borrow this?")){

            $.ajax({
                type: "PUT",
                url: "http://localhost/panel",
                data: {"bookId":activeRecord},
                dataType: 'json',
                success:function(data){alert(data);},
                error:function(){alert('error');}
            });
        }
        else{
            return false;
        }
    }
</script>


