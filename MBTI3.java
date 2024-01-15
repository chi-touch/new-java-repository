import java.util.Arrays;
import java.util.Scanner;
public class MBTI3{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("What is your name");
	String name = input.nextLine();

String [] optionA = {"null", "A. Expend energy,enjoy groups","A. Interpret literally","A. Logical,thinking,questioning","A. Organizes,orderly","A. more outgoing, think out loud","A. practical, realistic, experiential","A. candid,straight forward, frank","A. plan,schedule","A. seek many tasks","A. Standard,usual,conventional","A. firm, tend to criticize, hold the line","A. regulated,structured","A. External, communicative, express yourself","A. Focus on here- and- now","A. Tough-minded,just","A. Preparation,plan ahead","A. Active, initiate","A. Facts, things, what is","A. Matter of fact, issue- oriented","A. Control,govern"};

String [] optionB = {"null", "B. Conserve energy, enjoy oneo-on-one","B. Look for meaning and possibilities","B. Empathetic, feeling,accomodating","B. flexible,adaptable","B. More reserved, think to yourself","B. imaginative, innovative, theoretical","B. tactful,kind, encouraging","B. Unplanned, spontaneous","B. Seek private, solitary activitieees with quiet to concentrate","B. Different, novel,unique","B. Gentle,tend to appreciate, conciliate","B. Easy-going,live and let live","B. Internal, reticent, keep to yourself","B. Look to the future, gobal perpective,big picture","B. Tender- hearted,merciful","B. Go with the flow,adapt as you go","B. Reflective,delibrate","B. Ideas, dreams, what could be, philosphical", "B. Sensitive, people-oriented, compassionate","B. Latitude,freedom"};

String[]ExtrovertedEvsIntrovertedI = new String[5];
String[]SensingSvsIntuitiveN = new String[5];
String[]ThinkingTvsFeelingF = new String[5];
String[]JudgingJvsPerceptiveP = new String[5];

String result= input.nextLine();


int count1 =0;
int checkA = 0;
int checkB = 0;

int count2 = 0;
int checkA2 = 0;
int checkB2 = 0;

int count3 =0;
int checkA3 = 0;
int checkB3 = 0;

int count4 = 0;
int checkA4 = 0;
int checkB4 = 0;

String[] highest = new String[4];
String concantenate= " ";

for(int i = 1; i< optionA.length; i++){

System.out.printf("%7s								%s%n","A","B");
System.out.printf("%s			%s%n" ,optionA[i], optionB[i]);
result = input.next().toUpperCase();


	while(!result.equals("A") && !result.equals("B")){
		System.out.printf("Expected A or B as Response%nI know this is an error, Please retry again		%s%n",optionA[i],optionB[i]);
		result = input.next().toUpperCase();

	}
    

       System.out.println();
       if(i ==1 || i ==5 || i ==9 || i == 13 || i ==17){
           if(result.equals("A")){
           ExtrovertedEvsIntrovertedI[count1] = optionA[i];
           count1++;
           checkA++;
           }
           else if(result.equals("B")){
           ExtrovertedEvsIntrovertedI[count1] = optionB[i];
           count1++;
           checkB++;
           }
        }
	else if(i == 2 || i == 6||i ==10 || i == 14 || i == 18){
	    if(result.equals("A")){
	    SensingSvsIntuitiveN[count2] = optionA[i];
	    count2++;
	    checkA2++;
	    }
	    else if(result.equals("B")){
	    SensingSvsIntuitiveN[count2] = optionB[i];
	    count2++;
	    checkB2++;
	    }
        }
	else if(i == 3 || i ==7|| i ==11||i == 15|| i == 19){
		if(result.equals("A")){
		ThinkingTvsFeelingF[count3] = optionA[i];
		count3++;
		checkA3++;
		}
		else if(result.equals("B")){
		ThinkingTvsFeelingF[count3] = optionB[i];
		count3++;
		checkB3++;
		}
	}
	else if(i == 4|| i ==8|| i == 12||i == 16|| i == 20){
		if(result.equals("A")){
		JudgingJvsPerceptiveP[count4] = optionA[i];
		count4++;
		checkA4++;
		}
		else if(result.equals("B")){
		JudgingJvsPerceptiveP[count4] = optionB[i];
		count4++;
		checkB4++;
		}
	   }   
      }

      for(int counter = 0; counter < ExtrovertedEvsIntrovertedI.length;counter++){
      System.out.printf("%s%n", ExtrovertedEvsIntrovertedI[counter]);
    }
      System.out.printf("Number of A selected: %d%nNumber of B selected: %d%n%n", checkA, checkB);

      for(int counter =0; counter < SensingSvsIntuitiveN.length; counter++){
      System.out.printf("%s%n", SensingSvsIntuitiveN[counter]);
     }
       System.out.printf("Number of A selected: %d%n Number of B selected: %d%n%n", checkA2, checkB2);

      for(int count = 0; count < ThinkingTvsFeelingF.length; count++){
      System.out.printf("%s%n", ThinkingTvsFeelingF[count]);
      }
       System.out.printf("Number of A selected: %d%n Number of B selected: %d%n%n", checkA3, checkB3);
       for(int count = 0; count < JudgingJvsPerceptiveP.length;count++){
       System.out.printf("%s%n",JudgingJvsPerceptiveP[count]);
       }
       System.out.printf("Number of A selected: %d%nNumber of B selected: %d%n%n", checkA4, checkB4);

	if(checkA > checkB){
	   highest[0] = "E";
	}else{
	   highest[0] = "I";
	}

	if(checkA2 > checkB2){
	   highest[1] = "S";
	}else{
	   highest[1] = "F";
	}

	if(checkA3 > checkB3){
	  highest[2] = "T";
	}else{
	   highest[2] = "F";
	}
	
	if(checkA4 > checkB4){
	  highest[3] = "J";
	}else{
	  highest[3] = "P";
	}

	for(int count =0; count < highest.length; count++){
	    concantenate += highest[count];
	}
	System.out.println(concantenate);
	switch(concantenate){
		case "INFP":
			System.out.println("""
Healer
			The Thougthful Idealist (MBTI)
			The Mediator

The INFP Personality type
	INFPs are imaginative idealists, guided by their own core values and beliefs. 
	To  Healer, possibilities are paramount; the realism of the moment is only of passing concern. They see potential for a better future, and pursue truth and meaning with their own individuall flair.
INFPs are sensitive, caring, and compassionate, and are deeeply concerned with the  personal growth of themselves and others. Individualistic and nonjudgemental, INFPs believe that each person must find their own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging to others to do the same. INFPs are creative and often artistic; they enjoy finding new outlets for self expression.

What does INFP stand for?
INFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator(MBTI). INFP stands for Introversion, Intuition, Feeling, and Perceiving, which are fouir four core personality traits ased on the work of psychologist C.G. Jung.
Each of the four letters of the INFP code signifies a ky personality trait of this type. INFPs are energized by time alne (Introverted), focus on ideas and concepts rather than facts details (Intuitive),make decisions based on feelings and values (Feeling), and prefer to be spontaneous and flexible rather than planned and organized(Perceiving).""");
		break;

	case "INTJ":
		System.out.println("""
INTJ
		Mastermind
		The Conceptual Planner(MBTI)
		The Architect (16 personalities)
The INTJ pesonalities Type
	INTJs are analytical prolem- solvers, eager to improve systems and processes with their innovative ideas.
They have a talent for seeing possiblities for improvement, whether at work, at home, or in themselves.
	Often intellectual, INTJs enjoy logical reasoning and complex problem-solving.They approach life by analyzing the theory behind wht they see, and are typically focuse inward, on their own thoughtful study of the world around them. unpredictable nature of other people and their emotions. They are tpically indepentent and selctive about preferring to associate with people who they find stimulating.

What does INTJ Stand for?
	INTJ is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator(MBTI).INTJ stands for INtroverted, Intuitive, Thinking, Judging, which are foure core personality traits based on the work of psychologist C.G Jung.
Each of the four letters of the INTJ code signifies a key personality trait of this type. INTJs are energized rather than spontaneous and flexible(Judging).""");
		break;

		case "INFJ":
			System.out.println("""
INFJ
			Counselor
			The Insightful Visionary (MBTI)
			The Advocate ( 16 Personalities)
The INFJ personality type
	INFJs are thoughtful nurturers with a strong sense of personal integrity and a drive to help others realize their potential. Creative and dedicated, they have a talent for helping others with original solutions to their personal challenges.
The Counselor has a unique ability to intuit others' emotions and motivations, and will often know how someone else
is feeling before that person knows it himself. They trust their insights about others and have strong faith int their ability to read people. Although they are also reserved; the INFJ is a private sort, and is selective about sharing intimate thoughts and feelings.
	INFJs search for meaning and purpoe in their lives and in the outer world. They tend to have an immense interest in deeply understanding culture, society, and the universe as a whole. INFJs naturally see how every thought or action could potentially have important consequences, either positive or negative. This reflective and curious world view gives.
	INFJs a unique perpective and thoughtful approach to how they interact with others and the world around them.
Ultimately,INFJs seek to turn their abstract and intellectual musings into concrete actions that can be applied and make a transformative impact on others.Although it is common for INFJs to get struggle with taking action, when they are at their best, their actions are aligned with their authentic values.

What does INFJ Stands For?
		INFJ is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of
 the Myers-Briggs Type Indicator (MBTI®). 
Each of the four letters of the INFJ code signifies a key personality trait of this type. The letters INFJ stand
for the following dimensions of personality, based on the work of psychologist C.G. Jung:
Introverted: INFJs are energized by time alone
iNtuitive: INFJs focus on ideas and concepts rather than facts and details
Feeling: INFJs make decisions based on feelings and values
Judging: INFJs prefer to be planned and organized rather than spontaneous and flexible.
""");	
	break;

	case "INTP":
		  System.out.print("""
INTP
		Architect
		The Object Analyst (MBTI)
		The Logician (16 Personalities)
The INTP Personalities Type
INTPs are philosophical innovators, fascinated by logical analysis, systems, and design. They are 
preoccupied with theory, and search for the universal law behind everything they see. They want to understand
the unifying themes of life, in all their complexity.
	INTPs are detached, analytical observers who can seem oblivious to the world around them because they are so 
deeply absorbed in thought. They spend much of their time in their own heads: exploring concepts, making connections,
and seeking understanding of how things work. To the Architect, life is an ongoing inquiry into the mysteries of the universe.

What does INTP Stands for?
	INTP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the 
Myers-Briggs Type Indicator (MBTI®). INTP stands for Introverted, iNtuitive, Thinking, Perceiving, which are four core 
personality traits based on the work of psychologist C.G. Jung.
	The INTP type describes a person who is energized by time alone (Introverted), who focuses on ideas and concepts
 rather than facts and details (iNtuitive), who makes decisions based on logic and reason (Thinking) and who prefers to
 be spontaneous and flexible rather than planned and organized (Perceiving).
""");
	break;
	case "ENFP":
		System.out.print("""
ENFP
		Champion
		The Imaginative Motivator (MBTI)
		The Campaigner (16Personalities)
The ENFP Personalities type
	ENFPs are people-centered creators with a focus on possibilities and a contagious enthusiasm for new ideas,
 people and activities. Energetic, warm, and passionate, ENFPs love to help other people explore their creative potential.
	ENFPs are typically agile and expressive communicators, using their wit, humor, and mastery of language to create engaging
 stories. Imaginative and original, ENFPs often have a strong artistic side. They are drawn to art because of its ability
 to express inventive ideas and create a deeper understanding of human experience.

What does ENFP Stands for?
	ENFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs
Type Indicator (MBTI®). ENFP stands for Extraversion, iNtuition, Feeling, and Perceiving, which are four core personality 
traits based on the work of psychologist C.G. Jung.
Each of the four letters of the ENFP code signifies a key personality trait of this type. ENFPs are energized by time spent
with others (Extraverted), focus on ideas and concepts rather than facts and details (iNtuitive), make decisions based
on feelings and values (Feeling), and prefer to be spontaneous and flexible rather than planned and organized (Perceiving).
""");
	break;
	case "ENTJ":
		System.out.print("""
ENTJ
		Commander

The ENTJ Personalities type
	ENTJs are strategic leaders, motivated to organize change. They are quick to see inefficiency and conceptualize 
new solutions, and enjoy developing long-range plans to accomplish their vision. They excel at logical reasoning and are 
usually articulate and quick-witted.
	ENTJs are analytical and objective, and like bringing order to the world around them. When there are flaws in a system, 
the ENTJ sees them, and enjoys the process of discovering and implementing a better way. ENTJs are assertive and enjoy
 taking charge; they see their role as that of leader and manager, organizing people and processes to achieve their goals.

What does the ENTJ stands for?
	ENTJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers.
It stands for Extraverted, iNtuitive, Thinking, Judging. ENTJ indicates a person who is energized by time spent with others (Extraverted),
who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on logic and reason
(Thinking) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ENTJs are sometimes 
referred to as Commander personalities because of their innate drive to lead others.
""");
	break;
	case "ENTP":
		System.out.print("""
ENTP
		Visionary
		The Debator(16Personalities)

The ENTP Personalities type
	ENTPs are inspired innovators, motivated to find new solutions to intellectually challenging problems. They are 
curious and clever, and seek to comprehend the people, systems, and principles that surround them. Open-minded and 
unconventional, Visionaries want to analyze, understand, and influence other people.
	ENTPs enjoy playing with ideas and especially like to banter with others. They use their quick wit and command of 
language to keep the upper hand with other people, often cheerfully poking fun at their habits and eccentricities.
 While the ENTP enjoys challenging others, in the end they are usually happy to live and let live. They are rarely 
judgmental, but they may have little patience for people who can't keep up.

What does the ENTP stands for?
	ENTP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. 
It stands for Extraverted, iNtuitive, Thinking, Perceiving. ENTP indicates a person who is energized by time spent with 
others (Extraverted), who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on 
logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). 
ENTPs are sometimes referred to as Visionary personalities because of their passion for new, innovative ideas.
""");
	break;
	case "ENFJ":
		System.out.print("""
ENFJ
		Teacher
		The Protagonist(16Personalities)

The ENFJ Personalities type
	ENFJs are idealist organizers, driven to implement their vision of what is best for humanity. They often act as 
catalysts for human growth because of their ability to see potential in other people and their charisma in persuading 
others to their ideas. They are focused on values and vision, and are passionate about the possibilities for people.
	ENFJs are typically energetic and driven, and often have a lot on their plates. They are tuned into the needs 
of others and acutely aware of human suffering; however, they also tend to be optimistic and forward-thinking,
 intuitively seeing opportunity for improvement. The ENFJ is ambitious, but their ambition is not self-serving: 
rather, they feel personally responsible for making the world a better place.

What does ENFJ Stands for?
ENFJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers.
 It stands for Extraverted, iNtuitive, Feeling, Judging. ENFJ indicates a person who is energized by time spent with
 others (Extraverted), who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions 
based on feelings and values (Feeling) and who prefers to be planned and organized rather than spontaneous and
 flexible (Judging). ENFJs are sometimes referred to as Teacher personalities because of their interest in helping 
others develop and grow.
""");
	break;
	case "ISFJ":
		System.out.print("""
ISFJ
		Protector
		The Defender(16Personalities)

The ISFJ Personality Type
	ISFJs are industrious caretakers, loyal to traditions and organizations. They are practical, compassionate, 
and caring, and are motivated to provide for others and protect them from the perils of life.
	ISFJs are conventional and grounded, and enjoy contributing to established structures of society. They are steady 
and committed workers with a deep sense of responsibility to others. They focus on fulfilling their duties, particularly
 when they are taking care of the needs of other people. They want others to know that they are reliable and can be
 trusted to do what is expected of them. They are conscientious and methodical, and persist until the job is done.

What does ISFJ Stands for?
ISFJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers.
 It stands for Introverted, Sensing, Feeling, Judging. ISFJ indicates a person who is energized by time spent
 alone (Introverted),who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions
 based on feelings and values (Feeling) and who prefers to be planned and organized rather than spontaneous and 
flexible (Judging). ISFJs are sometimes referred to as Protector personalities because of their interest in keeping 
people safe and well cared for.
""");
	break;
	case "ISFP":
		System.out.print("""
ISFP
		Composer
		The Adventurer(16Personalities)

The ISFP Personalities type
	ISFPs are gentle caretakers who live in the present moment and enjoy their surroundings with cheerful, 
low-key enthusiasm. They are flexible and spontaneous, and like to go with the flow to enjoy what life has to offer. 
	ISFPs are quiet and unassuming, and may be hard to get to know. However, to those who know them well, 
the ISFP is warm and friendly, eager to share in life's many experiences.
ISFPs have a strong aesthetic sense and seek out beauty in their surroundings. They are attuned to sensory experience,
and often have a natural talent for the arts. ISFPs especially excel at manipulating objects, and may wield creative
tools like paintbrushes and sculptor's knives with great mastery.

What does ISFP Stands For?
ISFP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers.
It stands for Introverted, Sensing, Feeling, Perceiving. ISFP indicates a person who is energized by time spent 
alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions 
based on feelings and values (Feeling) and who prefers to be spontaneous and flexible rather than planned and 
organized (Perceiving). ISFPs are sometimes referred to as Composer personalities because of their innate sensibility
for creating aesthetically pleasing experiences.
""");
	break;
	case "ISTJ":
		System.out.print("""
ISTJ
		Inspector
		The Logistician(16Personalities)

The ISTJ Personalities type
	ISTJs are responsible organizers, driven to create and enforce order within systems and institutions. They are
 neat and orderly, inside and out, and tend to have a procedure for everything they do. Reliable and dutiful, ISTJs want
 to uphold tradition and follow regulations.
ISTJs are steady, productive contributors. Although they are Introverted, ISTJs are rarely isolated; typical ISTJs know 
just where they belong in life, and want to understand how they can participate in established organizations and systems.
They concern themselves with maintaining the social order and making sure that standards are met.

What does ISTJ Stands for?	
	ISTJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers.
 It stands for Introverted, Sensing, Thinking, Judging. ISTJ indicates a person who is energized by time spent alone (Introverted),
 who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking)
 and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ISTJs are sometimes referred to as
 Inspector personalities because of their focus on details and interest in doing things correctly.
""");
	break;

	case "ISTP":
		System.out.print("""
ISTP
	Craftsman
	The Virtuoso(16Personalities)

The ISTP Personalities type
	ISTPs are observant artisans with an understanding of mechanics and an interest in troubleshooting. They approach 
their environments with a flexible logic, looking for practical solutions to the problems at hand. They are independent
and adaptable, and typically interact with the world around them in a self-directed, spontaneous manner.
	ISTPs are attentive to details and responsive to the demands of the world around them. Because of their astute sense
 of their environment, they are good at moving quickly and responding to emergencies. ISTPs are reserved, but not withdrawn: 
the ISTP enjoys taking action, and approaches the world with a keen appreciation for the physical and sensory experiences it
 has to offer.

What does ISTP Stands For?
	ISTP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers.
It stands for Introverted, Sensing, Thinking, Perceiving. ISTP indicates a person who is energized by time spent alone (Introverted),
who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking)
and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ISTPs are sometimes referred to as
Craftsperson personalities because they typically have an innate mechanical ability and facility with tools.
""");
	break;

	case "ESFJ":
		System.out.print("""
ESFJ
		Provider
		The Consul(16Personalities)

The ESFJ Personalities type
	ESFJs are conscientious helpers, sensitive to the needs of others and energetically dedicated to their responsibilities.
 They are highly attuned to their emotional environment and attentive to both the feelings of others and the perception others
 have of them. ESFJs like a sense of harmony and cooperation around them, and are eager to please and provide.
	ESFJs value loyalty and tradition, and usually make their family and friends their top priority. They are generous
 with their time, effort, and emotions. They often take on the concerns of others as if they were their own, and will
 attempt to put their significant organizational talents to use to bring order to other people's lives.

What does ESFJ Stands For?
ESFJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands
for Extraverted, Sensing, Feeling, Judging. ESFJ indicates a person who is energized by time spent with others (Extraverted),
who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling)
and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ESFJs are sometimes referred to as Provider personalities because of their interest in taking care of others in practical ways.
""");
				break;
	case "ESFP":
		System.out.print("""
ESFP
		Performer
		The Entertainer(16Personalities)
The ESFP Personalities type	
	ESFPs are vivacious entertainers who charm and engage those around them. They are spontaneous, energetic, and fun-loving,
 and take pleasure in the things around them: food, clothes, nature, animals, and especially people.
	ESFPs are typically warm and talkative and have a contagious enthusiasm for life. They like to be in the middle of the action 
and the center of attention. They have a playful, open sense of humor, and like to draw out other people and help them have a good time.

What does ESFP Stands for ?
 	ESFP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands for
Extraverted, Sensing, Feeling, Perceiving. ESFP indicates a person who is energized by time spent with others (Extraverted), 
who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling) 
and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ESFPs are sometimes referred
to as Performer personalities because of their playful, energetic nature.
""");
				break;
	case "ESTJ":
		System.out.print("""
ESTJ
		Supervisor
		The Executive(16Personalities)

The ESTJ Personality type
	ESTJs are hardworking traditionalists, eager to take charge in organizing projects and people. Orderly, rule-abiding,
 and conscientious, ESTJs like to get things done, and tend to go about projects in a systematic, methodical way.
ESTJs are the consummate organizers, and want to bring structure to their surroundings. They value predictability and prefer 
things to proceed in a logical order. When they see a lack of organization, the ESTJ often takes the initiative to establish 
processes and guidelines, so that everyone knows what's expected.

What ESTJ Stands For ?
	ESTJ is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. 
It stands for Extraverted, Sensing, Thinking, Judging. ESTJ indicates a person who is energized by time spent with others (Extraverted), 
who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking)
and who prefers to be planned and organized rather than spontaneous and flexible (Judging). 
	ESTJs are sometimes referred to as Supervisor personalities because they tend to take charge and make sure things are done 
correctly.
""");
				break;
				case "ESTP":
					System.out.print("""
ESTP
		Dynamo
		The Enterpreneur(16Personalities)

The ESTP Personalities type
	ESTPs are energetic thrill-seekers who are at their best when putting out fires, whether literal or metaphorical. 
They bring a sense of dynamic energy to their interactions with others and the world around them. They assess situations quickly
and move adeptly to respond to immediate problems with practical solutions.
	Active and playful, ESTPs are often the life of the party and have a good sense of humor. They use their keen powers of 
observation to assess their audience and adapt quickly to keep interactions exciting. Although they typically appear very social,
 they are rarely sensitive; the ESTP prefers to keep things fast-paced and silly rather than emotional or serious.

What does ESTP Stands for ?
ESTP is an acronym used to describe one of the sixteen personality types created by Katharine Briggs and Isabel Myers. It stands
for Extraverted, Sensing, Thinking, Perceiving. ESTP indicates a person who is energized by time spent with others (Extraverted), 
who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking) 
and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ESTPs are sometimes referred to as
Dynamo personalities because of their high-energy, active approach to life.
""");




}

}

}


    
