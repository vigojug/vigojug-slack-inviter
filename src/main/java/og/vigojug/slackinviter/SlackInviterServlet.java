package og.vigojug.slackinviter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.vigojug.slackinviter.PhpVigoScrapper;

@SuppressWarnings("serial")
@WebServlet(name = "slackinviter", value = "/")
public class SlackInviterServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();

        PhpVigoScrapper e = new PhpVigoScrapper();
        out.println(PhpVigoScrapper.slackInvite("anton@galiglobal.com"));
    }
}
