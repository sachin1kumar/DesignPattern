package com.company.compositepattern

import com.company.compositepattern.composite.CompositeStructure
import com.company.compositepattern.leaves.CoFounder
import com.company.compositepattern.leaves.Developer
import com.company.compositepattern.leaves.Founder

fun main() {
    val firstDeveloper = Developer("John",21000)
    val secondDeveloper = Developer("Jane",31000)

    //add to composite..
    val developerStructure = CompositeStructure()
    developerStructure.addMember(firstDeveloper)
    developerStructure.addMember(secondDeveloper)

    val founder = Founder("Peter",210000)
    val coFounder = CoFounder("Parik",310000)

    //add to composite..
    val founderStructure = CompositeStructure()
    founderStructure.addMember(founder)
    founderStructure.addMember(coFounder)

    //We can add above composites to the different composites as well.
    val composite = CompositeStructure()
    composite.addMember(developerStructure)
    composite.addMember(founderStructure)

    //Display the details..
    composite.showMemberDetails()
}