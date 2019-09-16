import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "testDemo")
public class testDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>1.找到Tomcat主目录，进入conf，找到server。xml，将<connector port=8080>中的8080修改为其他端口号 2.Catalina是Tomcat的servlet容器。Catalina实现了Sun Microsystems对servlet和JavaServer Pages（JSP）的规范。在Tomcat中，Realm元素表示分配给这些用户的用户名，密码和角色（类似于Unix组）的“数据库”。Realm的不同实现允许Catalina集成到已经创建和维护此类认证信息的环境中，然后使用该信息实现Container Managed Security，如Servlet Specification\n" +
                "\n" +
                "Coyote是Tomcat的连接器组件，它支持HTTP 1.1协议作为Web服务器。这允许Catalina（名义上是Java Servlet或JSP容器）也可以作为将本地文件作为HTTP文档提供的普通Web服务器。\n" +
                "\n" +
                "Coyote侦听特定TCP端口上到达服务器的传入连接，并将请求转发给Tomcat引擎以处理该请求并向请求客户端发回响应。另一个Coyote连接器Coyote JK类似地侦听，但是使用JK协议将其请求转发给另一个Web服务器，例如Apache。这通常提供更好的性能。</h1>");
    }
}
