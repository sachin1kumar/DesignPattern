package com.company.compositepattern.leaves

import com.company.compositepattern.component.TeamMember

class Developer(private val name: String, private val salary: Int) : TeamMember {

    override fun showMemberDetails() {
        println("Developer details: $name : $salary")
    }

}