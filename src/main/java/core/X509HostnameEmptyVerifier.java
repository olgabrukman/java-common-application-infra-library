package core;

import org.apache.http.conn.ssl.X509HostnameVerifier;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import java.io.IOException;
import java.security.cert.X509Certificate;

public class X509HostnameEmptyVerifier implements X509HostnameVerifier {
    public boolean verify(String arg0, SSLSession arg1) {
        return true;
    }

    public void verify(String host, SSLSocket ssl) throws IOException {
    }

    public void verify(String host, X509Certificate cert) throws SSLException {
    }

    public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {
    }

}
