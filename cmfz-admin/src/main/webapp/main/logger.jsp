<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/datagrid-detailview.js"></script>

<script type="text/javascript">
$(function() {

    $('#ttLogger').datagrid({
		height:570,
        remoteSort:false,
        singleSelect:true,
        nowrap:false,
        fitColumns:true,
        url:'${pageContext.request.contextPath}/logger/showLogger',
        columns:[[
            {field:'logId',title:'日志编号',width:100},
            {field:'logUser',title:'创建用户',width:20,sortable:true},
            {field:'logTime',title:'创建时间',width:80,sortable:true},
            {field:'logResource',title:'操作表',width:30,sortable:true},
            {field:'logAction',title:'操作方式',width:30,sortable:true},
            {field:'logMessage',title:'参数',width:80,sortable:true},
            {field:'logResult',title:'结果',width:40,sortable:true},
            {field:'status',title:'操作',width:40,align:'center',formatter:function(value,row,index){
                //$("#del").linkbutton({});
                return "<a name='artA' class='easyui-linkbutton' data-options=\"height:20,iconCls:'icon-edit'\" onClick='getLoggerBtn()'>查看详情</a>";
            }}
        ]],
        onLoadSuccess:function(){
            $("a[name='artA']").linkbutton({});
        },
        pagination:true,
        pageList : [ 5, 10, 15, 20, 25 ],
        pageSize : 10,
        toolbar : "#tb",

    });


});

function getLoggerBtn(){
    $("#dialogLogger").dialog({
        iconCls:'icon-pictures',
        width:600,
        height:500,
        title:"文章详情",
        href:"${pageContext.request.contextPath}/main/showArticle.jsp",
        modal:true,
        minimizable:true,
        maximizable:true,
        onLoad:function(){
            var rowData = $("#ttLogger").datagrid("getSelected");
            document.getElementById("hh").innerHTML=rowData.articleName;
            document.getElementById("hh1").innerHTML=rowData.introduction;
        }
    });
}

</script>


<table id="ttLogger"></table>
<div id="dialogLogger"></div>

