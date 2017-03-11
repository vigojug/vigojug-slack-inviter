package og.vigojug.slackinviter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLAnchorElement;
import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLElement;

@SuppressWarnings("serial")
@WebServlet(name = "slackinviter", value = "/")
public class SlackInviterServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();

        try {
            WebClient webClient = new WebClient();
            webClient.getOptions().setThrowExceptionOnScriptError(false);
            HtmlPage currentPage = webClient.getPage("http://phpvigo.com/");

            HtmlForm form = (HtmlForm) currentPage.getElementById("slack-invite-send-form--2");

/*            <form action="/" method="post" id="" accept-charset="UTF-8"><div><div class="form-item form-item-slack-email form-type-textfield form-group"> <label class="control-label" for="edit-slack-email--2">Correo electrónico</label>
<input class="form-control form-text" title="Introduce el email para recibir tu invitación" data-toggle="tooltip" type="text" id="edit-slack-email--2" name="slack_email" value="" size="60" maxlength="128"></div><button type="submit" id="edit-submit--2" name="op" value="Enviar" class="btn btn-default form-submit">Enviar</button>
<input type="hidden" name="form_build_id" value="form-7SzXuI1tlsCIHZpU-UfFCoSWPHHQLYQKMGoM9tp4feg">
<input type="hidden" name="form_id" value="slack_invite_send_form">
</div></form>*/

            final HtmlTextInput textField = form.getInputByName("slack_email");
            textField.setValueAttribute("ayuste@optaresolutions.com");

            //final HtmlSubmitInput button = form.getInputByName("op");
            HtmlButton button = (HtmlButton) currentPage.getElementById("edit-submit--2");
            HtmlPage result_page = button.click();

            System.out.println(form.getId());
            out.println(result_page.asText());

        }catch (Exception e) {
            System.out.printf("Error: " + e);
        }
    }
}
