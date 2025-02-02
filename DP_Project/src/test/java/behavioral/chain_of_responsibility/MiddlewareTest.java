package test.java.behavioral.chain_of_responsibility;

import main.java.behavioral.chain_of_responsibility.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiddlewareTest {
    private Server server;
    private Middleware middlewareChain;

    @BeforeEach
    void setUp() {
        server = new Server();
        server.register("admin@example.com", "admin123");
        server.register("user@example.com", "user123");

        // Build the middleware chain
        middlewareChain = Middleware.link(
                new ThrottlingMiddleware(3),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middlewareChain);
    }

    @Test
    void testSuccessfulAdminLogin() {
        boolean result = server.logIn("admin@example.com", "admin123");
        assertTrue(result, "Admin login should be successful");
    }

    @Test
    void testSuccessfulUserLogin() {
        boolean result = server.logIn("user@example.com", "user123");
        assertTrue(result, "User login should be successful");
    }

    @Test
    void testLoginWithWrongPassword() {
        boolean result = server.logIn("user@example.com", "wrongpassword");
        assertFalse(result, "Login should fail with an incorrect password");
    }

    @Test
    void testLoginWithNonExistingEmail() {
        boolean result = server.logIn("nonexistent@example.com", "somepassword");
        assertFalse(result, "Login should fail for an unregistered email");
    }


    @Test
    void testRoleCheckMiddlewareForAdmin() {
        boolean result = server.logIn("admin@example.com", "admin123");
        assertTrue(result, "Admin should pass the role check");
    }

    @Test
    void testRoleCheckMiddlewareForUser() {
        boolean result = server.logIn("user@example.com", "user123");
        assertTrue(result, "User should be able to log in without admin role");
    }
}