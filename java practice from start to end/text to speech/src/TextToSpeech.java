import com.sun.speech.freetts.*;
public class TextToSpeech {

	   private static final String VOICE_NAME = "kevin16"; // Voice type
	   private static final String TEXT = "Hello, world!"; // Text to convert
	   
	   public static void main(String[] args) {
	      Voice voice;
	      VoiceManager voiceManager = VoiceManager.getInstance();
	      voice = voiceManager.getVoice(VOICE_NAME);
	      if (voice != null) {
	         voice.allocate();
	         voice.speak(TEXT);
	         voice.deallocate();
	      } else {
	         System.err.println("Error: No voice available for " + VOICE_NAME);
	      }
	      
	   }
	}
	