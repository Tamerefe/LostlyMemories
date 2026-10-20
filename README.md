# Lostly Memories 🌟

A text-based adventure game about lost memories. A dusty package arrives at your door holding an antique music box and a faded letter. Wind the box, follow the fragments of a life you can't remember, and decide what kind of future you want to build.

## 🎮 Features

- **Bilingual Support**: Play in English or Turkish (İngilizce veya Türkçe)
- **Interactive Storytelling**: Make choices that affect your journey
- **Multiple Paths**: Different story branches based on your decisions
- **Mini-Games**: Hum back the music box melody from memory, and play Rock, Paper, Scissors with Sophie
- **Memory Journal**: Collect up to 10 memory fragments; type `j` (or `g` in Turkish) at any choice to view them
- **Bonds**: Your choices strengthen your bond with Elena and Sophie
- **7 Endings + Endings Gallery**: Discovered endings are saved between runs and shown from the main menu
- **Hidden True Ending**: Recover 5 memory fragments in one playthrough to hear the music box's last song
- **Colorful Console Output**: Enhanced visual experience with colored text
- **Memory Mystery**: Uncover the secrets of your lost memories

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- Command line interface (Terminal/Command Prompt)

### Installation

1. Clone this repository or download the source files
2. Navigate to the project directory
3. Compile the Java files:
   ```bash
   javac *.java
   ```

### Running the Game

1. Start the main lobby:
   ```bash
   java lobby
   ```

2. Choose your preferred language:
   - Type `1` for English
   - Type `2` for Türkçe

3. Follow the on-screen prompts and make your choices!

## 🎯 Game Files

- `lobby.java` - Main entry point and language selection
- `storyenglish.java` - English version of the adventure story
- `storyturkish.java` - Turkish version of the adventure story
- `rockpaperscissors.java` - Mini-game implementation
- `gamestate.java` - Memory fragments, bonds, safe input, endings gallery
- `minigames.java` - Melody puzzle and Rock, Paper, Scissors with Sophie
- `T_3xt.java` - Standalone Tic-Tac-Toe

## 🎲 Gameplay

1. **Character Creation**: Enter your name to begin your journey
2. **The Package**: Wind the music box, study the letter, or put it away and see where the night takes you
3. **Decision Making**: Make choices that shape your bond with Elena and Sophie and decide your fate
4. **Mini-Games**: Remember the music box melody and challenge Sophie to Rock, Paper, Scissors
5. **Story Discovery**: Collect memory fragments and uncover what really happened on the rainy night

**Controls:** type the number of a choice, `j` / `g` for the memory journal, `q` to quit.

## 🌍 Language Support

### English
Complete adventure story with multiple branching paths and outcomes.

### Türkçe
Tam Türkçe hikaye desteği ile farklı yollar ve sonuçlar.

## 🎨 Technical Features

- Console-based user interface
- ANSI color codes for enhanced visual experience
- Input validation and error handling
- Modular code structure for easy maintenance

## 🤝 Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for:
- Bug fixes
- New story paths
- Additional language support
- Code improvements
- Documentation updates

## 📝 Development

To add new features or modify the game:

1. **Adding New Paths**: Modify the story files (`storyenglish.java` or `storyturkish.java`)
2. **Adding Languages**: Create new story files following the existing pattern
3. **Enhancing Graphics**: Modify the ANSI color codes and ASCII art
4. **Adding Mini-Games**: Create new classes similar to `rockpaperscissors.java`

## 🎭 Story Themes

- Mystery and amnesia
- Fantasy adventure
- Choice and consequence
- Self-discovery
- Dark forest atmosphere

## ⚠️ System Requirements

- Java Runtime Environment (JRE) 8+
- Terminal/Console with Unicode support
- ANSI color support (most modern terminals)

## 🐛 Known Issues

- Some terminals may not fully support ANSI color codes

## 🔮 Future Plans

- [ ] Save/Load game functionality
- [ ] More complex branching narratives
- [ ] Sound effects integration
- [ ] GUI version
- [ ] Multiplayer support
- [x] Achievement system (endings gallery)

## 📞 Support

If you encounter any issues or have questions about the game, please create an issue in the repository.

---

**Enjoy your journey through Lostly Memories! 🌙✨**

*Remember: Every choice matters, and your memories are waiting to be discovered...*
