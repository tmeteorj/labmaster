<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/taglib.jsp"%>

<html>
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
    <%@ include file="../common/stylesheet.jsp"%>
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-2" style="background-color: #2d2c41; height: 100%">
                <%@include file="../common/sidebar.jsp"%>
            </div>
            <div class="col-md-10">
                <div class="row">
                    <!-- -->
                    <form class="form-inline">
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">ID</div>
                                <input type="text" class="form-control" id="id" placeholder="ID">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">用户名</div>
                                <input type="text" class="form-control" id="name" placeholder="用户名">
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">搜索</button>
                    </form>
                </div>
                <div class="row">
                    <!-- -->
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>
                                #
                            </th>
                            <th>
                                用户名
                            </th>
                            <th>
                                属性
                            </th>
                            <th>
                                备注
                            </th>
                            <th>
                                是否有效
                            </th>
                            <th>
                                创建时间
                            </th>
                            <th>
                                操作
                            </th>
                        </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${page.content}" var="user" varStatus="status">
                                <tr>
                                    <td>
                                        <c:out value="${user.id}"/>
                                    </td>
                                    <td>
                                        <c:out value="${user.userName}"/>
                                    </td>
                                    <td>
                                        <c:out value="${user.attributes}"/>
                                    </td>
                                    <td>
                                        <c:out value="${user.remark}"/>
                                    </td>
                                    <td>
                                        <c:out value="${user.deletedMark}"/>
                                    </td>
                                    <td>
                                        <c:out value="${user.metaCreated}"/>
                                    </td>
                                    <td>
                                        <button type="button" class="btn btn-primary">详情</button>
                                        <button type="button" class="btn btn-warning">修改</button>
                                        <button type="button" class="btn btn-danger">删除</button>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <%@ include file="../common/javascript.jsp"%>
</body>
</html>
