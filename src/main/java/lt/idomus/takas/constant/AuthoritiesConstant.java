package lt.idomus.takas.constant;

public class AuthoritiesConstant {

    public static final String[] USER_ROLES = {"article:read", "article:create"};
    public static final String[] ADMIN_ROLES = {"article:read", "article:create", "article:update"};
    public static final String[] SUPER_ADMIN_ROLES = {"article:read", "article:create", "article:update", "article:delete"};

}
