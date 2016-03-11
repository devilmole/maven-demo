<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="zh-CN">
<body>
<h2>Hello World!</h2>
<h3>web2224442</h3>
<a href="#" onclick="goto()">123123123</a>
</body>
<script src="${ctx}/js/jquery.min.js" type="text/javascript"></script>
<script language="javascript">
    function goto(){
        var d={
            draw:1,
            columns:[],
//            order:[],
            start:0,
//            search:{
//                value:00,
//                regex:"aaa"
//            }
        };
        d.columns.push({
            data:"数据",
            name:"姓名",

        });
//        var user=[{name:"张三",id:"F001",nick:"绰号"},{name:"张三2",id:"F0012",nick:"绰号2"}];
        $.ajax({
            url:"${ctx}/home",
            data: JSON.stringify(d),
            method:"POST",
            dataType:"JSON",
            contentType:"application/json;charset=UTF-8",
            success: function(result){
                console.log("result",result);
            }


        });

    }
</script>

</html>
