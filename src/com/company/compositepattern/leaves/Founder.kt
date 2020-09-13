package com.company.compositepattern.leaves

import com.company.compositepattern.component.TeamMember

class Founder(private val name: String, private val salary: Int) : TeamMember {

    override fun showMemberDetails() {
        println("Founder details: $name : $salary")
    }
}