package hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ExportToDB {

	public static void main(String[] args) throws Exception {
		// ��ȡ�����ļ�
		Configuration cfg = new Configuration().configure();

		// ����SchemaExport����
		SchemaExport export = new SchemaExport(cfg);

		// �������ݿ��
		export.create(true, true);
	}
}