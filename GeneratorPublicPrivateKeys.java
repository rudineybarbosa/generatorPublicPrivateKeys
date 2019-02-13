import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class GeneratorPublicPrivateKeys {

	public static void main(String[] args) {
		try {

			/**
			 * Learning how to generate RSA public and private keys
			 */
			KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
			
			//Key lengths: 512, 1024, OR 2048
			kpg.initialize(512);
			
			KeyPair kp = kpg.generateKeyPair();
			
			RSAPublicKey rsaPublicKey = (RSAPublicKey) kp.getPublic();
			
			RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) kp.getPrivate();
			System.out.println("Public key ");
			System.out.println("String  : " + rsaPublicKey.toString() );
			//System.out.println("algorith: " + rsaPublicKey.getAlgorithm() );
			//System.out.println("modulus : " + rsaPublicKey.getModulus() );
			//System.out.println("Expoent : " + rsaPublicKey.getPublicExponent());
			//System.out.println("Encoded : " + rsaPublicKey.getEncoded().toString() );
			System.out.println();
			System.out.println("Private key ");
			System.out.println("modulus : " + rsaPrivateKey.getModulus() );
			System.out.println("Expoent : " + rsaPrivateKey.getPrivateExponent());
			//System.out.println("algorith: " + rsaPrivateKey.getAlgorithm() );
			//System.out.println("Format  : " + rsaPrivateKey.getFormat() );
			//System.out.println("Encoded : " + rsaPrivateKey.getEncoded() );
			
			
		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
			
		}

	}

}
