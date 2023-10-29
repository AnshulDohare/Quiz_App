package com.example.quizapp;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Topic>topics;
    public static ArrayList<Questions>worldGeographyQuestions;
    public static ArrayList<String>worldGeographyAnswers;
    public static ArrayList<Questions>indianPoliticsQuestions;
    public static ArrayList<String>indianPoliticsAnswers;
    public static ArrayList<Questions>indianHistoryQuestions;
    public static ArrayList<String>indianHistoryAnswers;
    public static ArrayList<Questions>indianEconomyQuestions;
    public static ArrayList<String>indianEconomyAnswers;
    public static ArrayList<Questions>indianGeographyQuestions;
    public static ArrayList<String>indianGeographyAnswers;
    public static ArrayList<Questions>generalKnowledgeQuestions;
    public static ArrayList<String>generalKnowledgeAnswers;

    @Override
    public void onCreate() {
        super.onCreate();
        topics = new ArrayList<>();
        topics.add(new Topic("World Geography"));
        topics.add(new Topic("Indian Politics"));
        topics.add(new Topic("Indian History"));
        topics.add(new Topic("Indian Economy"));
        topics.add(new Topic("Indian Geography"));
        topics.add(new Topic("General Knowledge"));

        worldGeographyQuestions = new ArrayList<>();
        worldGeographyQuestions.add(new Questions("Which is the longest river in the world ?","Amazon River","Nile River","Yangtze River","Yenisei River"));
        worldGeographyQuestions.add(new Questions("Which from the following is the busiest Oceanic trade route ?","Cape Route","Suez Canal","Panama Canal","Malacca Straits"));
        worldGeographyQuestions.add(new Questions("Which of the following countries is known as the \"Land of Thunderbolt\" ?","Bhutan","Nepal","Myanmar","Indonesia"));
        worldGeographyQuestions.add(new Questions("Which one is the largest landlocked country in the world ?","Ethiopia","Mongolia","Chad","Kazakhstan"));
        worldGeographyQuestions.add(new Questions("Which city is known as seven islands city?","Singapore","Sydney","Mumbai","Cape Town"));
        worldGeographyAnswers = new ArrayList<>();
        worldGeographyAnswers.add("Nile River");
        worldGeographyAnswers.add("Panama Canal");
        worldGeographyAnswers.add("Bhutan");
        worldGeographyAnswers.add("Kazakhstan");
        worldGeographyAnswers.add("Mumbai");

        indianPoliticsQuestions = new ArrayList<>();
        indianPoliticsQuestions.add(new Questions("Who is the guardian of fundamental Rights enumerated in Indian Constitution?","President","Supreme Court","Parliament","Prime Minister"));
        indianPoliticsQuestions.add(new Questions("Who is known as the grand old lady of Indian nationalism?","Indira Gandhi","Dr. Sarojini Naidu","Mother Teressa","Dr. Annie Besant"));
        indianPoliticsQuestions.add(new Questions("When was the Panchayati Raj System introduced in India?","26 January 1951","2 October 1959","15 August 1956","26 November 1949"));
        indianPoliticsQuestions.add(new Questions("In which state, the President's Rule was first imposed in India ?","Andhra Pradesh","Bihar","Assam","West Bengal"));
        indianPoliticsQuestions.add(new Questions("Who was the only Lok Sabha Speaker to have become the President of India ?","VV Giri","Zail Singh","Neelam Sanjiva Reddy","S.Radhakrishnan"));
        indianPoliticsAnswers = new ArrayList<>();
        indianPoliticsAnswers.add("Supreme Court");
        indianPoliticsAnswers.add("Dr. Annie Besant");
        indianPoliticsAnswers.add("2 October 1959");
        indianPoliticsAnswers.add("Andhra Pradesh");
        indianPoliticsAnswers.add("Neelam Sanjiva Reddy");

        indianHistoryQuestions = new ArrayList<>();
        indianHistoryQuestions.add(new Questions("Who among the following ruler was defeated by Seleucus?","Chandra Gupta Maurya","Vikramaditya","Chanakya","None of the above"));
        indianHistoryQuestions.add(new Questions("Who wrote Bande Mataram ?","Rabindranath Tagore","Bankimchandra Chatterjee","Sharat chandra chattopadhyay","Mahatma Gandhi"));
        indianHistoryQuestions.add(new Questions("Where is situated the battlefield of Plessey?","Punjab","Haryana","West Bengal","Karnataka"));
        indianHistoryQuestions.add(new Questions("When did the Jallianwalla Bagh incident take place?","On 13 April 1919","On 15 August 1919","On 27 October 1919","On 10 March 1919"));
        indianHistoryQuestions.add(new Questions("Ramayana was translated into persian at Akbar's court by whom?","Birbal","Abul Fazal","Faizi","Tansen"));
        indianHistoryAnswers = new ArrayList<>();
        indianHistoryAnswers.add("Chandra Gupta Maurya");
        indianHistoryAnswers.add("Bankimchandra Chatterjee");
        indianHistoryAnswers.add("West Bengal");
        indianHistoryAnswers.add("On 13 April 1919");
        indianHistoryAnswers.add("Faizi");

        indianEconomyQuestions = new ArrayList<>();
        indianEconomyQuestions.add(new Questions("Who was the first Indian governor of the Reserve Bank of India?","C.D. Deshmukh","Sachindra Roy","S Mukherjee","None of these"));
        indianEconomyQuestions.add(new Questions("Who is the father of the White Revolution in India?","M.S.Swaminathan","Verghese Kurien","R.S.Sodhi","Sam Pitroda"));
        indianEconomyQuestions.add(new Questions("Which of the following crops was focussed in the green revolution?","Ground nuts and Oil seeds","Wheat and Rice","Tur Dal and Corn","None of the above"));
        indianEconomyQuestions.add(new Questions("Who among the following presented the first budget (interim) of Independent India?","Jawaharlal Nehru","Sardar Patel","Dr. Rajendra Prasad","R K Shanmukham Chetty"));
        indianEconomyQuestions.add(new Questions("Which Ministry has started the Ganga Aamantran Abhiyan?","Jal Shakti Ministry","Ministry of Environment","Ministry of Drinking Water and Sanitation","Ministry of Agriculture & Farmer's Welfare"));
        indianEconomyAnswers = new ArrayList<>();
        indianEconomyAnswers.add("C.D. Deshmukh");
        indianEconomyAnswers.add("Verghese Kurien");
        indianEconomyAnswers.add("Wheat and Rice");
        indianEconomyAnswers.add("R K Shanmukham Chetty");
        indianEconomyAnswers.add("Jal Shakti Ministry");

        indianGeographyQuestions = new ArrayList<>();
        indianGeographyQuestions.add(new Questions("Which of the following is India’s largest salt producing state?","Rajasthan","Tamil Nadu","Odisha","Gujarat"));
        indianGeographyQuestions.add(new Questions("What is the total area of India?","97,06,961 km²","32,87,263 km²","27,80,400 km²","76,92,024 km²"));
        indianGeographyQuestions.add(new Questions("Keoladeo Ghana National Park is located in which place ?","Bharatpur,Rajasthan","Varanasi,Uttar Pradesh","Junagadh,Gujarat","Jorhat,Assam"));
        indianGeographyQuestions.add(new Questions("Which of the following is the largest port by size and shipping traffic in india ?","Mumbai Port","Cochin Port","Kolkata Port","Visakhapatnam Port"));
        indianGeographyQuestions.add(new Questions("which state has the largest coastline in india ?","Maharashtra","Tamil Nadu","Andhra Pradesh","Odisha"));
        indianGeographyAnswers = new ArrayList<>();
        indianGeographyAnswers.add("Gujarat");
        indianGeographyAnswers.add("32,87,263 km²");
        indianGeographyAnswers.add("Bharatpur,Rajasthan");
        indianGeographyAnswers.add("Mumbai Port");
        indianGeographyAnswers.add("Andhra Pradesh");

        generalKnowledgeQuestions = new ArrayList<>();
        generalKnowledgeQuestions.add(new Questions("What is the unit of Current ?","meter","ohm","ampere","newton"));
        generalKnowledgeQuestions.add(new Questions("Which animal is known as the 'Ship of the Desert'?","Rhinoceros","Fennec foxes","Zebra","Camel"));
        generalKnowledgeQuestions.add(new Questions("Which colour symbolises peace?","White","Red","Violet","Orange"));
        generalKnowledgeQuestions.add(new Questions("What is the capital of United Arab Emirates ?","Dubai","Sharjah","Abu Dhabi","Fujairah"));
        generalKnowledgeQuestions.add(new Questions("Who is the author of 'Romeo and Juliet'?","Diana Gabaldon","William Shakespeare","Julia Quinn","Jane Ashford"));
        generalKnowledgeAnswers = new ArrayList<>();
        generalKnowledgeAnswers.add("ampere");
        generalKnowledgeAnswers.add("Camel");
        generalKnowledgeAnswers.add("White");
        generalKnowledgeAnswers.add("Abu Dhabi");
        generalKnowledgeAnswers.add("William Shakespeare");
    }
}
