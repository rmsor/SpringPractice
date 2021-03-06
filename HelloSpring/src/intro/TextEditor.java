package intro;

public class TextEditor {
	private SpellChecker spellChecker;
	private WithConstruct withConstruct;

	public TextEditor(WithConstruct withConstruct) {
		System.out.println("Inside TextEditor constructor.");
		this.withConstruct = withConstruct;
	}

	// a setter method to inject the dependency.
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	// a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}