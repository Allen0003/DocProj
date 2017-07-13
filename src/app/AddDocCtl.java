package action;

import java.io.IOException;

import bo.DocBo;
import entity.DocCtl;
import util.Const;

public class AddDocCtl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		if (session.getAttribute("user_Auth") == null || !session.getAttribute("user_Auth").equals(Const.Manager)) {
			response.sendRedirect("../common/logout.jsp");
			return;
		}

		DocBo bo = null;
		String url = "../query/list.jsp?mes=success";
		try {
			DocCtl docCtl = new DocCtl();
			docCtl.setDocID(Const.getKey(Const.DocID_Type_Ctl));

			docCtl.setDocType(
					Integer.parseInt(request.getParameter("num") != null ? request.getParameter("num").trim() : ""));

			docCtl.setDocName(request.getParameter("docName") != null ? request.getParameter("docName").trim() : "");

			docCtl.setMemo(request.getParameter("memo"));

			docCtl.setSysid(
					session.getAttribute("user_No") != null ? ((String) session.getAttribute("user_No")).trim() : "");

			if (docCtl.getDocName().equals("") || docCtl.getSysid().equals("")) {
				url = "../query/list.jsp?mes=fail";
			} else {
				bo = new DocBo();
				bo.addDocCtl(docCtl);
			}

		} catch (Exception e) {
			url = "../query/list.jsp?mes=fail";
			Const.logUtil.info("AddDocCtlServlet fail");
		} finally {
			try {
				bo.disconnect();
			} catch (Exception e) {
			}
		}
		response.sendRedirect(url);
		return;
	}
}
