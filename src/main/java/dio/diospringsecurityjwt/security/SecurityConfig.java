package dio.diospringsecurityjwt.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
// chave privada como segurança no código
@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {
    public static String PREFIX; // prefixo do token
    public static String KEY; // sua chave privada
    public static Long EXPIRATION; // tempo de expiração

    public void setPrefix(String prefix){
        PREFIX = prefix;
    }

    public void setKey(String key){
        KEY = key;
    }

    public void setExpiration(Long expiration){
        EXPIRATION = expiration;
    }
}
