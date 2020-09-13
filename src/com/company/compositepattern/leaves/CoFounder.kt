package com.company.compositepattern.leaves

import com.company.compositepattern.component.TeamMember

class CoFounder(private val name: String, private val salary: Int) : TeamMember {

    override fun showMemberDetails() {
        println("CoFounder details: $name : $salary")
    }
}